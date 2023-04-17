class block_text(private var heder: String, private var t_heder: String, private var m_text: Array<String>) {
    fun give(): MutableList<String> {
        var block: MutableList<String> = mutableListOf()
        block.add("\n-->  ${heder}  <--")
        block.add("\n~~   ${t_heder}   ~~")
        for (elm in m_text) {
            block.add("\n* ${elm}")
        }
        return block
    }
}
