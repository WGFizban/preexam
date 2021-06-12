class Player(
    val name: String,
    var tokensMap: MutableMap<Tokens, Int> = mutableMapOf(
        Tokens.CLOTH to 0,
        Tokens.WINE to 0,
        Tokens.GRAIN to 0
    )
) {
    var majorityGoodsMap: MutableMap<Tokens, Int> = mutableMapOf(
        Tokens.CLOTH to 0,
        Tokens.WINE to 0,
        Tokens.GRAIN to 0
    )
    var point = 0
        get() {
            return if (extension.isOn){
                var fromGoods = 0
                for (g in majorityGoodsMap)
                    fromGoods += g.value
                field + fromGoods
            } else field
        }
}