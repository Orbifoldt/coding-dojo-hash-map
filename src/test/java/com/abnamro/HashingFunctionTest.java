package com.abnamro;

import org.assertj.core.data.MapEntry;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class HashingFunctionTest {

    private final List<String> words = List.of("abandon,ability,able,abortion,about,above,abroad,absence,absolute,absolutely,absorb,abuse,academic,accept,access,accident,accompany,accomplish,according,account,accurate,accuse,achieve,achievement,acid,acknowledge,acquire,across,act,action,active,activist,activity,actor,actress,actual,actually,ad,adapt,add,addition,additional,address,adequate,adjust,adjustment,administration,administrator,admire,admission,admit,adolescent,adopt,adult,advance,advanced,advantage,adventure,advertising,advice,advise,adviser,advocate,affair,affect,afford,afraid,African,African-American,after,afternoon,again,against,age,agency,agenda,agent,aggressive,ago,agree,agreement,agricultural,ah,ahead,aid,aide,AIDS,aim,air,aircraft,airline,airport,album,alcohol,alive,all,alliance,allow,ally,almost,alone,along,already,also,alter,alternative,although,always,AM,amazing,American,among,amount,analysis,analyst,analyze,ancient,and,anger,angle,angry,animal,anniversary,announce,annual,another,answer,anticipate,anxiety,any,anybody,anymore,anyone,anything,anyway,anywhere,apart,apartment,apparent,apparently,appeal,appear,appearance,apple,application,apply,appoint,appointment,appreciate,approach,appropriate,approval,approve,approximately,Arab,architect,area,argue,argument,arise,arm,armed,army,around,arrange,arrangement,arrest,arrival,arrive,art,article,artist,artistic,as,Asian,aside,ask,asleep,aspect,assault,assert,assess,assessment,asset,assign,assignment,assist,assistance,assistant,associate,association,assume,assumption,assure,at,athlete,athletic,atmosphere,attach,attack,attempt,attend,attention,attitude,attorney,attract,attractive,attribute,audience,author,authority,auto,available,average,avoid,award,aware,awareness,away,awful,baby,back,background,bad,badly,bag,bake,balance,ball,ban,band,bank,bar,barely,barrel,barrier,base,baseball,basic,basically,basis,basket,basketball,bathroom,battery,battle,be,beach,bean,bear,beat,beautiful,beauty,because,become,bed,bedroom,beer,before,begin,beginning,behavior,behind,being,belief,believe,bell,belong,below,belt,bench,bend,beneath,benefit,beside,besides,best,bet".split(","));

    @Test
    void hash_of_a_word_is_always_greater_or_equal_to_0_and_less_than_MODULUS(){
        var hashes = words.stream().collect(Collectors.toMap(Function.identity(), HashingFunction::hash));
        hashes.forEach((x, y) -> System.out.println("'" + x + "' has hash = " + y));

        hashes.forEach((word, hash) -> {
            assertThat(hash).isGreaterThanOrEqualTo(0);
            assertThat(hash).isLessThan(HashingFunction.MODULUS);
        });
    }

}
