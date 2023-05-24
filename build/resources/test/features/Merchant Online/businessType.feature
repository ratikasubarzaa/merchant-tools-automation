Feature:
 Merchant Online

    @createMerchantonline @positiveCases
    Scenario Outline: As a user successful to filled "Jenis Usaha" for personal with valid data
      Given the user click  individu button
      When the user click lanjutkan button
      And the ask permission popup appears
      And click iya button
      Then the result will directly to business information page
#      And the user input merchant name <merchantName>
#      And the user select the category merchant
#      And the user input domain url <domainUrl>
#      And the user input address <addresssJenisUsaha>
#      And the user input mailing address <mailingAddress>
#      And the user input owner name <directorName>
#      And the user input KTP number <ktpNumber>
#      And the user input receipent email notification <receipientemail>
#      And the user input email customer service <emailCustomerService>
#      When the user click lanjutkan button
#      Then Inputing data for jenis usaha has beens successful
#      And the user directly to pic and bank page

      Examples:
        | merchantName | domainUrl| addresssJenisUsaha| mailingAddress| directorName| ktpNumber| receipientemail| emailCustomerService|
        |automationTest 1| autopedia.com| jalanautoedia  | ratika.subarza@finaccel.co|autopedia | 3453647589375645364758| ratikasubarza@gmail.com| ratikasubarza@gmail.com|

#    @createMerchantonline @postivecase
#    Scenario Outline:   As a user successful to filled "Informasi Penanggung Jawab & Pembayaran" for personal with valid data
#      Given the user input pic business in the field <picBusiness>
#      When the user input jabatan in the field <jabatan>
#      And the user input email kantor in the field <emailKantor>
#      And the user input phone number <teleponKantor>
#
#     Examples:
#      |picBusiness| jabatan| emailKantor| teleponKantor|
#      |borsak     | direktur| borsak.sihombing@finaccel.co|0846724287|
#
