package com.seleb.eduardo.mvp_java_example.welcome;

import com.seleb.eduardo.mvp_java_example.BasePresenter;
import com.seleb.eduardo.mvp_java_example.BaseView;
import com.seleb.eduardo.mvp_java_example.data.models.Task;

import java.util.List;

public interface StartContract {

    interface View extends BaseView<Presenter> {

        //Critical part
        void showTasks(List<Task> tasks);
        void showTaskDetailUi(String taskId);
        void showAddTaskUi();
        //Messages
        void showSpecificMessage();
        void mensajeBienvenida();
        //Extra functionality
        void showMenu();



    }

    interface Presenter extends BasePresenter{
        //Critical
        void loadTasks(boolean forceUpdate);
        //Functions
        void completeTask(Task completedTask);
        void mostrarMensajeBienvenida();
        //Information about the activity or fragment
    }

}
