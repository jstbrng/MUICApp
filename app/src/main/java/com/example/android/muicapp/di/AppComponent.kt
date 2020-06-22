package com.example.android.muicapp.di

import com.example.android.muicapp.ui.fragment.about.AboutFragment
import com.example.android.muicapp.ui.fragment.samples.SamplesFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ViewModelFactoryModule::class])
interface AppComponent {

    fun inject(fragment: SamplesFragment)
    fun inject(fragment: AboutFragment)
}