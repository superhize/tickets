package co.uk.magmo.puretickets.locale

import co.aikar.locales.MessageKey
import co.aikar.locales.MessageKeyProvider

enum class Messages : MessageKeyProvider {
    // GENERAL
    GENERAL__LIST_FORMAT, GENERAL__LOG_FORMAT,
    // SENDER
    SENDER__NEW_TICKET, SENDER__UPDATE_TICKET, SENDER__CLOSE_TICKET, SENDER__PICK_TICKET, SENDER__YIELD_TICKET,
    SENDER__ASSIGN_TICKET, SENDER__DONE_TICKET, SENDER__REOPEN_TICKET, SENDER__NOTE_TICKET, SENDER__TELEPORT_TICKET,
    // NOTIFICATION
    NOTIFICATION__PICK_TICKET, NOTIFICATION__YIELD_TICKET, NOTIFICATION__ASSIGN_TICKET, NOTIFICATION__DONE_TICKET,
    NOTIFICATION__REOPEN_TICKET, NOTIFICATION__NOTE_TICKET,
    // ANNOUNCEMENT
    ANNOUNCEMENT__NEW_TICKET, ANNOUNCEMENT__UPDATE_TICKET, ANNOUNCEMENT__CLOSE_TICKET, ANNOUNCEMENT__PICK_TICKET,
    ANNOUNCEMENT__YIELD_TICKET, ANNOUNCEMENT__ASSIGN_TICKET, ANNOUNCEMENT__DONE_TICKET, ANNOUNCEMENT__REOPEN_TICKET,
    ANNOUNCEMENT__NOTE_TICKET,
    // DISCORD
    DISCORD__NEW_TICKET, DISCORD__UPDATE_TICKET, DISCORD__CLOSE_TICKET, DISCORD__PICK_TICKET, DISCORD__YIELD_TICKET,
    DISCORD__ASSIGN_TICKET, DISCORD__DONE_TICKET, DISCORD__REOPEN_TICKET, DISCORD__NOTE_TICKET,
    // TITLES
    TITLES__SPECIFIC_TICKETS, TITLES__YOUR_TICKETS, TITLES__ALL_TICKETS, TITLES__SPECIFIC_STATUS, TITLES__TICKET_STATUS,
    TITLES__SHOW_TICKET, TITLES__TICKET_LOG,
    // SHOW NAMES
    SHOW__SENDER, SHOW__PICKER, SHOW__UNPICKED, SHOW__MESSAGE,
    // EXCEPTIONS
    EXCEPTIONS__TICKET_NOT_FOUND, EXCEPTIONS__INVALID_SETTING_TYPE,
    // OTHER
    OTHER__REMINDER, OTHER__SETTING_UPDATE;

    override fun getMessageKey(): MessageKey {
        return MessageKey.of(name.toLowerCase().replace("__", "."))
    }

    companion object {
        fun retrieve(targetType: TargetType, messageNames: MessageNames): Messages {
            return valueOf(targetType.name + "__" + messageNames.name)
        }
    }
}