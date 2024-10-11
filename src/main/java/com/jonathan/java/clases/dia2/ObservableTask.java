package src.main.java.com.jonathan.java.clases.dia2;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import java.util.logging.Logger;

public class ObservableTask {

    static Logger logger = Logger.getLogger(ObservableTask.class.getName());

    public static void main(String[] args) {
        observableExample();
    }

    public static void observableExample() {

        Observable<Integer> observable = Observable.range(1, 10);
        Integer variableNumerica = 0;

        Observer<Integer> observerQueIncrementa = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                
            }

            @Override
            public void onNext(Integer value) {
                value++;
                System.out.println("Valor autoIncrementado: " + value);
            }

            @Override
            public void onError(Throwable e) {}

            @Override
            public void onComplete() {}
        };

        Observer<Integer> observerQueHaceElFactorial = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                
            }
            
            public Integer calcularFactorial(Integer numero){
                if(numero < 1){
                    return 1;
                }
                return numero = numero*calcularFactorial(numero-1);
            }

            @Override
            public void onNext(Integer value) {
                
                System.out.println("El factorial de "+value+" es " + calcularFactorial(value));
            }

            @Override
            public void onError(Throwable e) {}

            @Override
            public void onComplete() {}
        };

        Observer<Integer> observerQueMultiplica = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {}

            @Override
            public void onNext(Integer value) {
                System.out.println("El numero por 1234 es "+ (1234*value));
            }

            @Override
            public void onError(Throwable e) {}

            @Override
            public void onComplete() {}
        };

        observable.subscribe(observerQueIncrementa);
        observable.subscribe(observerQueHaceElFactorial);
        observable.subscribe(observerQueMultiplica);
        
        
    }

}