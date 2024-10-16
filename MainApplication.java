package com.example.demo;

import io.reactivex.schedulers.Schedulers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
        Observable<Integer> observable = Observable.range(1, 5);
        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("Subscribed");
            }
            @Override
            public void onNext(Integer value) {
                System.out.println("Received: " + value);
                //factorial(value);
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
// Suscribir el observable al observador
        observable.subscribe(observer);
        observable.unsubscribeOn(Schedulers.io());
    }
}
