package com.tunepruner.voixt.editor.editorscreen.model

class DomainString(
    val string: String,
    val dpWidth: Int,
    val spaceAfter: Boolean,
    val filters: List<TextFilter>? = null
)