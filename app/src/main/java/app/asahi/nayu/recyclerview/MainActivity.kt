package app.asahi.nayu.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val memoDate:List<MemoData> = listOf(
        MemoData(R.drawable.hades,"鬼夢","テーててテーててテーテーテー"),
        MemoData(R.drawable.haha,"いつのだよww","アホみたいなスクショ"),
        MemoData(R.drawable.images,"いつぞやの","人生の迷路"),
        MemoData(R.drawable.itigo,"付け忘れたやつ","かわいそうに"),
        MemoData(R.drawable.naze,"誰よww","なんだお前！w"),
        MemoData(R.drawable.scr,"飽きた","そろそろめんどい ")

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RecyclerViewAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        adapter.addAll(memoDate)
    }
}
