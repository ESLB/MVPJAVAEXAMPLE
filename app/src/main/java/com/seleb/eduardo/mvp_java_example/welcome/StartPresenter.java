package com.seleb.eduardo.mvp_java_example.welcome;

import android.support.annotation.NonNull;

import com.seleb.eduardo.mvp_java_example.data.models.Task;

import static com.google.android.gms.common.internal.Preconditions.checkNotNull;

public class StartPresenter implements StartContract.Presenter {

    //private final BaseDeDatos mBaseDeDatos;
    private final StartContract.View mStartView;

    private String SomeInfo;

    public StartPresenter(@NonNull StartContract.View startView){
        mStartView = checkNotNull(startView, "No puede ser null");

        mStartView.setPresenter(this);
    }


    @Override
    public void loadTasks(boolean forceUpdate) {

    }

    @Override
    public void completeTask(Task completedTask) {

    }

    @Override
    public void mostrarMensajeBienvenida() {
        mStartView.mensajeBienvenida();
    }

    @Override
    public void start() {
        //Hacer lo que tenga que hacer al iniciar esta actividad
    }
}
