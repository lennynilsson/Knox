package se.bylenny.skeleton.models

data class Row(
    val layout: LayoutType,
    val cells: List<Cell>
)

enum class LayoutType {
    _50_50,
    _100,
    _33_66,
    _66_33
}

data class Cell(
    val components: List<Component>
)

open class Component(
    val type: ComponentType
)

class ImageComponent(val url: String) : Component(ComponentType.image)
class TextComponent(val text: String) : Component(ComponentType.text)

enum class ComponentType {
    image,
    text
}
