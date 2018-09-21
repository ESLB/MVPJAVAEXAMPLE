package com.seleb.eduardo.mvp_java_example.welcome;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.seleb.eduardo.mvp_java_example.R;
import com.seleb.eduardo.mvp_java_example.data.models.Task;

import java.util.List;

import es.dmoral.toasty.Toasty;

import static com.google.android.gms.common.internal.Preconditions.checkNotNull;

/**
 * A simple {@link Fragment} subclass.
 */
public class StartFragment extends Fragment implements StartContract.View {

    //private Todos los widgets y adaptadores necesarios para ellos
    //TextView, ImageButton, ETC

    private Button mButtonPrueba;

    private StartContract.Presenter mPresenter;

    public StartFragment() {

    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_start, container, false);

        mButtonPrueba = root.findViewById(R.id.buttonPrueba);
        mButtonPrueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.mostrarMensajeBienvenida();
            }
        });

        return root;

    }

    @Override
    public void showTasks(List<Task> tasks) {

    }

    @Override
    public void showTaskDetailUi(String taskId) {

    }

    @Override
    public void showAddTaskUi() {

    }



    @Override
    public void showSpecificMessage() {

    }

    @Override
    public void mensajeBienvenida() {
        Toasty.success(getContext(), "Bienvenido", Toast.LENGTH_LONG, true).show();
    }

    @Override
    public void showMenu() {

    }

    @Override
    public void setPresenter(@NonNull StartContract.Presenter presenter) {
        mPresenter = checkNotNull(presenter);
    }
}
