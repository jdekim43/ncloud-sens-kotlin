package kr.jadekim.ncloud.sens.enumeration

import com.google.gson.TypeAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter

enum class Country(val code: Int) {
    USA(1),
    CANADA(1),
    TAIWAN(886),
    JAPAN(81),
    CHINA(86),
    SINGAPORE(65),
    HONGKONG(852),
    INDONESIA(62),
    MALAYSIA(60),
    PHILIPPINES(63),
    THAILAND(66),
    BRUNEI_DARUSSALAM(673),
    VIETNAM(84),
    LAOS(856),
    MYANMAR(95),
    CAMBODIA(885),
    MACAU(853),
    BANGLADESH(880),
    INDIA(91),
    PAKISTAN(92),
    SAUDI_ARABIA(966),
    UNITED_ARAB_EMIRATES(971),
    ARMENIA(374),
    AZERBAIJAN(994),
    AFGHANISTAN(93),
    ALBANIA(355),
    YEMEN(967),
    OMAN(968),
    JORDAN(962),
    UZBEKISTAN(998),
    UKRAINE(380),
    ISRAEL(972),
    EGYPT(20),
    KUWAIT(965),
    KYRGYZSTAN(996),
    TAJIKISTAN(992),
    TURKEY(90),
    TURKMENISTAN(993),
    NEW_ZEALAND(64),
    AUSTRALIA(61),
    PAPUA_NEW_GUINEA(675),
    GREECE(30),
    NETHERLANDS(31),
    DENMARK(45),
    GERMANY(49),
    LATVIA(371),
    ROMANIA(40),
    LUXEMBOURG(352),
    LITHUANIA(370),
    MALTA(356),
    BELGIUM(32),
    BULGARIA(359),
    SWEDEN(46),
    SPAIN(34),
    SLOVAKIA(421),
    SLOVENIA(386),
    IRELAND(353),
    ESTONIA(372),
    UNITED_KINGDOM(44),
    AUSTRIA(43),
    ITALY(39),
    CZECH_REPUBLIC(420),
    CROATIA(385),
    CYPRUS(357),
    PORTUGAL(351),
    POLAND(48),
    FRANCE(33),
    FINLAND(358),
    HUNGARY(36),
    NORWAY(47),
    RUSSIA(7),
    LEBANON(961),
    MACEDONIA(389),
    BAHRAIN(973),
    BELARUS(375),
    BOSNIA(387),
    SERBIA(381),
    SWITZERLAND(41);

    object GsonAdapter : TypeAdapter<Country>() {

        override fun write(out: JsonWriter, value: Country?) {
            out.value(value?.code)
        }

        override fun read(input: JsonReader): Country = values().first { it.code == input.nextInt() }
    }
}