package src.main.java.com.jonathan.java.clases.dia2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import java.util.logging.Logger;

public class ObservableExample {

    static Logger logger = Logger.getLogger(ObservableExample.class.getName());

    public static void main(String[] args) {
        observableExample();
    }

    public static void observableExample() {

        Observable<Integer> observable = Observable.range(1, 5);

        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("Subscribed");
            }

            @Override
            public void onNext(Integer value) {
                System.out.println("Received: " + value);
            }

            @Override
            public void onError(Throwable e) {
                System.err.println("Error: " + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("Completed");
            }
        };

        observable.subscribe(observer);
        observable.unsubscribeOn(Schedulers.io());
    }

}