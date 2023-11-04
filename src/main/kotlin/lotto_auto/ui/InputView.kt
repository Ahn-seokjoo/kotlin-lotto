package lotto_auto.ui

object InputView {
    fun input(): Int {
        println(ENTER_LOTTO_PRICE)
        val input = readln().toIntOrNull() ?: error(ERROR_TEXT)
        val lottoCount = transformLottoCountFromInput(input)
        check(lottoCount > MINIMUM_COUNT) { CHECK_MINIMUM_COUNT_TEXT }
        println("${lottoCount}${BUY_COUNT}")
        return lottoCount
    }

    fun transformLottoCountFromInput(input: Int): Int {
        return input / THOUSAND_WON
    }

    private const val ENTER_LOTTO_PRICE = "구입금액을 입력해 주세요."
    private const val ERROR_TEXT = "올바른 숫자를 입력 해주세요"
    private const val MINIMUM_COUNT = 0
    private const val CHECK_MINIMUM_COUNT_TEXT = "1개 이상을 구매하세요"
    private const val BUY_COUNT = "개를 구매했습니다."
    private const val THOUSAND_WON = 1000
}
