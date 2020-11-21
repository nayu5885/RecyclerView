package app.asahi.nayu.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter (private val context: Context):
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> (){
    val items:MutableList<MemoData> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.item_memo_data_cell,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item =items[position]
        holder.characterImage.setImageResource(item.characterImageView)
        holder.memoTextView.text = item.memoTextView
        holder.noteTextView.text = item.noteTextView
    }

    fun addAll(items:List<MemoData>){
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val characterImage: ImageView =view.findViewById(R.id.characterImageView)
        val memoTextView: TextView =view.findViewById(R.id.memoTextView)
        val noteTextView: TextView=view.findViewById(R.id.noteTextView)
    }


}