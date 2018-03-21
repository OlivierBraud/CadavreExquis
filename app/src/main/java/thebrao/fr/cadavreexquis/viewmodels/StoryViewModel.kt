package thebrao.fr.cadavreexquis.viewmodels

import android.app.Application
import android.content.Context
import android.text.format.DateFormat
import thebrao.fr.cadavreexquis.R
import thebrao.fr.cadavreexquis.models.Story
import thebrao.fr.cadavreexquis.services.UserService

/**
 * View model of a story
 */
class StoryViewModel(private val story: Story, context: Context) {

    val dateUpdated: String

    val hero: String

    val title: String?

    var favorite: Boolean

    val continuity: Boolean

    init {
        val dateFormat = context.getString(R.string.app_date_format)
        dateUpdated = DateFormat.format(dateFormat, story.timestampUpdated).toString()
        hero = String.format(context.getString(R.string.story_hero_label), story.hero)
        title = story.title
        favorite = story.favoritedBy.contains(UserService.getCurrentUserId())
        continuity = story.continuity
    }
}
