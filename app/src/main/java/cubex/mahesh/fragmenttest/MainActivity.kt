package cubex.mahesh.fragmenttest

import android.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun  load(v:View)
    {
        var fManager = fragmentManager
        var tx = fManager.beginTransaction()

        if(v.id == R.id.home){
                tx.replace(R.id.frag1,HomeFrag())
            }else if(v.id==R.id.courses){
                tx.replace(R.id.frag1,CoursesFrag())
            }else if(v.id==R.id.materials){
            tx.replace(R.id.frag1,MaterialsFrag())
        }
        tx.commit()
    }
}
