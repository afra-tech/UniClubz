package com.example.cse486.uniclubz.ViewModel;

import android.app.Activity;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

import com.example.cse486.uniclubz.Model.Repository.StudentRepository;
import com.example.cse486.uniclubz.Model.entity.Student;

public class StudentViewModel extends AndroidViewModel {

    StudentRepository repository;
    public StudentViewModel(@NonNull Application application) {
        super(application);
        repository = new StudentRepository();
    }

    public boolean newStudent(String sname, String sbg, String sphone, String snid, String email, String sdob, String password, Activity activity)
    {
        return repository.newStudent(sname,sbg,sphone,snid,email,sdob,password,activity);

    }

    public Student getBasicinfo
}
