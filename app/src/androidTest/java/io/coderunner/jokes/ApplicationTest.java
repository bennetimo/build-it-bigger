package io.coderunner.jokes;

import android.test.AndroidTestCase;
import android.text.TextUtils;

import java.util.concurrent.CountDownLatch;

public class ApplicationTest extends AndroidTestCase {

    private CountDownLatch mSignal;
    private String mJoke;

    @Override
    protected void setUp() throws Exception {
        mSignal = new CountDownLatch(1);
    }

    @Override
    protected void tearDown() throws Exception {
        mSignal.countDown();
    }

    public void testAsyncTask() throws InterruptedException {
        EndpointsAsyncTask task = new EndpointsAsyncTask(new EndpointsAsyncTask.OnTaskCompleted() {
            @Override
            public void onTaskCompleted(String result) {
                mJoke = result;
                mSignal.countDown();
            }
        });

        task.execute();
        mSignal.await();
        assertFalse(TextUtils.isEmpty(mJoke));
    }

}
