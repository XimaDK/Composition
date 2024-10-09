package kadyshev.dmitry.composition.presentation

import android.content.Context

class AndroidResourceProvider(private val context: Context) : ResourceProvider {
    override fun getString(resId: Int): String {
        return context.getString(resId)
    }

}


interface ResourceProvider {
    fun getString(resId: Int): String
}
