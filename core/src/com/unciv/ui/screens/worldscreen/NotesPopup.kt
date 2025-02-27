package com.unciv.ui.screens.worldscreen

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.scenes.scene2d.ui.Table
import com.unciv.UncivGame
import com.unciv.logic.civilization.NotificationCategory
import com.unciv.logic.civilization.NotificationIcon
import com.unciv.logic.trade.TradeLogic
import com.unciv.logic.trade.TradeOffer
import com.unciv.logic.trade.TradeOfferType
import com.unciv.models.translations.tr
import com.unciv.ui.components.extensions.pad
import com.unciv.ui.components.extensions.toLabel
import com.unciv.ui.components.input.KeyCharAndCode
import com.unciv.ui.components.widgets.UncivTextField
import com.unciv.ui.popups.Popup
import com.unciv.ui.screens.diplomacyscreen.DiplomacyScreen
import com.unciv.ui.screens.diplomacyscreen.LeaderIntroTable
import kotlin.math.max
import kotlin.math.min
import com.unciv.ui.components.widgets.AutoScrollPane as ScrollPane

class NotesPopup(worldScreen: WorldScreen) : Popup(worldScreen) {
    val viewingCiv = worldScreen.viewingCiv
    
     init { 
         val noteTextField = UncivTextField("hier kommt die notiz")
         add(noteTextField).colspan(4).fillX().pad(5f)
         add(noteTextField).colspan(4).row()
         addSeparator(Color.DARK_GRAY, height = 1f)
         addButton("save") { 
             close()
        }
    }
    override fun close() {
        super.close()
    }

  
}
