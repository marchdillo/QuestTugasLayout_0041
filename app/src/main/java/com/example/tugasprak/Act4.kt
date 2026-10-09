package com.example.tugasprak

import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Data tiap card (semua nilai berupa ID resource)
data class DataOrang(
    @StringRes val nama: Int,
    @StringRes val alamat: Int,
    @ColorRes val warnaBg: Int,
    @ColorRes val warnaAlamat: Int,
    val cursive: Boolean = false
)

private val daftarOrang = listOf(
    DataOrang(R.string.nama_0, R.string.alamat_0, R.color.card_0_bg, R.color.teks_alamat_kuning, cursive = true),
    DataOrang(R.string.nama_1, R.string.alamat_1, R.color.card_1_bg, R.color.teks_alamat_kuning),
    DataOrang(R.string.nama_2, R.string.alamat_2, R.color.card_2_bg, R.color.teks_alamat_putih),
    DataOrang(R.string.nama_3, R.string.alamat_3, R.color.card_3_bg, R.color.teks_alamat_putih)
)

// Widget Card: 1 fungsi terpisah yang dipakai oleh semua card
@Composable
fun KartuItem(data: DataOrang, modifier: Modifier = Modifier) {

}

