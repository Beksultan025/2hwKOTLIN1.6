package com.example.a2hwkotlin16.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    protected lateinit var binding: VB

    protected abstract fun inflateViewBinding(): VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflateViewBinding()
        setContentView(binding.root)

        isConnection()
        initViews()
        initViewModel()
        initListener()
    }

    open fun initViews() {} //Инициализация вью
    open fun initListener() {} //Все наши клики
    open fun initViewModel() {} // Все обзерверы нашего viewModel\' а
    open fun isConnection() {} // Проверка подключение к интернету
}