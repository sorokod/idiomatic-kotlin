package p02_classesAndFunctions.t12_Typealias.good

class Event

typealias EventHandler = (Event) -> Unit

class EventDispatcher {
    fun addClickHandler(handler: EventHandler) {
    }

    fun removeClickHandler(handler: EventHandler) {
    }
}
