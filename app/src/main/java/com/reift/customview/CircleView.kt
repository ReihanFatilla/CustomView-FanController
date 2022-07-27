package com.reift.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CircleView(context: Context, attributeSet: AttributeSet)
    : View(context, attributeSet) {

    //radius untuk view
    private var radius = 100f

    // warna untuk view
    private  var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    // untuk menggambar view ke tampilan
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.color = Color.RED
        canvas?.drawCircle(radius, radius, radius, paint)
    }

    // onFinishedInflate() -> method ini di panggil setelah view dan semua
    //                       turunannya berhasil di inflate dari xml-nya

    // onMeasure() -> method untuk menentukan ukuran view dan semua
    //                turunannya

    // onLayout() -> method untuk menentukan posisi view dan
    //               semua turunannya

    // onSizeChanged() -> method yg di panggil setelah ukuran telah di rubah

    // onDraw() -> di panggil ketika tampilan harus melakukan render kontennya

    //onKeyDown() -> di panggil ketika ada sebuah event key down bary terjadi

    // onKeyUp() -> dipanggil ketika event key up terjadi

    // onTrackballEvent() -> dipangigl ketika terjadi gerakan pada trackball

    // onTouchEvent() -> dipanggil ketika terjadi sentuhan pada layar

}