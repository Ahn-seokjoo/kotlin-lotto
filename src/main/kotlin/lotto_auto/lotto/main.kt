package lotto_auto.lotto

import lotto_auto.ui.InputView
import lotto_auto.ui.OutputView

fun main() {
    val inputAmount = InputView.input()
    val count = InputView.lottoCount(inputAmount)

    val lottoList = (1..count).map { Lotto() }
    OutputView.print(lottoList)

    val lastWeekLottoNumber = InputView.lastWeekInput().toLotto()

    val sumOfWonLotto = LottoAuto.sumOfWonLottoList(lottoList, lastWeekLottoNumber)

    val resultRate: Float = LottoAuto.earningRate(sumOfWonLotto, inputAmount)

    val matchCountList = LottoAuto.matchCountList(lottoList, lastWeekLottoNumber)

    OutputView.showResult(matchCountList, resultRate)
}
