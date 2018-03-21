package thebrao.fr.cadavreexquis.adapters

import android.support.v7.widget.RecyclerView
import android.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.ViewGroup
import thebrao.fr.cadavreexquis.R
import thebrao.fr.cadavreexquis.databinding.RowStoryBinding
import thebrao.fr.cadavreexquis.viewmodels.StoryViewModel


class StoryListAdapter(stories: List<StoryViewModel>) : RecyclerView.Adapter<StoryListAdapter.ViewHolder>() {
    private var mStories: List<StoryViewModel> = stories

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<RowStoryBinding>(inflater, R.layout.row_story, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = mStories[position]
        holder.bind(user)
    }

    override fun getItemCount(): Int {
        return mStories.size
    }

    class ViewHolder : RecyclerView.ViewHolder {
        private var mBinding: RowStoryBinding

        constructor(binding: RowStoryBinding) : super(binding.root) {
            mBinding = binding
        }

        fun bind(storyViewModel: StoryViewModel) {
            mBinding.story = storyViewModel
            mBinding.executePendingBindings()
        }
    }


}
