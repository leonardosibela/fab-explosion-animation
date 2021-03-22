package com.sibela.fabexplosionanimation

import android.view.View
import android.view.animation.Animation

fun View.startAnimationWithEndExecution(animation: Animation, onEnd: () -> Unit) {
    animation.setAnimationListener(object : Animation.AnimationListener {
        override fun onAnimationStart(animation: Animation?) {}

        override fun onAnimationRepeat(animation: Animation?) {}

        override fun onAnimationEnd(animation: Animation?) {
            onEnd()
        }
    })
    this.startAnimation(animation)
}