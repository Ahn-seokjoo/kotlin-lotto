package lotto_auto.lotto

object LottoAuto {
    private fun createLotto(): List<Int> = (1..45).shuffled().subList(0, 6).sorted()
    fun createLottoList(count: Int): List<List<Int>> = (1..count).map {
        createLotto()
    }

    private fun eachLottoMatchCount(
        lottoList: List<List<Int>>,
        lastWeekLottoNumber: List<Int>
    ): List<Int> = lottoList.map { myLotto ->
        lastWeekLottoNumber.mapNotNull {
            if (myLotto.contains(it)) it else null
        }.count()
    }

    /**
     * 구매한 로또 총 당첨 금액
     */
    fun resultSum(lottoList: List<List<Int>>, lastWeekLottoNumber: List<Int>): Int =
        eachLottoMatchCount(lottoList, lastWeekLottoNumber).sumOf {
            replaceMatchCountToMoney(it)
        }

    /**
     * match 개수 만큼 금액 으로 변경
     */
    private fun replaceMatchCountToMoney(it: Int) = when (it) {
        3 -> 5000
        4 -> 50000
        5 -> 1500000
        6 -> 2000000000
        else -> 0
    }

    fun matchCountList(lottoList: List<List<Int>>, lastWeekLottoNumber: List<Int>): List<Int> {
        val three = eachLottoMatchCount(lottoList, lastWeekLottoNumber).count { it == 3 }
        val four = eachLottoMatchCount(lottoList, lastWeekLottoNumber).count { it == 4 }
        val five = eachLottoMatchCount(lottoList, lastWeekLottoNumber).count { it == 5 }
        val six = eachLottoMatchCount(lottoList, lastWeekLottoNumber).count { it == 6 }
        return listOf(three, four, five, six)
    }

    fun earningRate(resultSum: Int, inputAmount: Int): Float = resultSum.toFloat() / inputAmount.toFloat()
}
