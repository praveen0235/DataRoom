Feature: Firefly checking



@Yes
Scenario Outline: Catching service functionality checking
Given Call the Catching Service "<Catching Service>" and "<MethodName>"

Examples:
| Catching Service | MethodName |
| http://10.18.15.68/IC.3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.15.68/ICocd-3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.5.5.60/IC3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.5.5.60/ICkey3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.5.5.60/ICocd3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.13.20.165/IC3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.13.20.165/IC-ocd-3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.13.20.165/ICkey3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.35.68/ICkey3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.15.69/ICkey3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.5.5.60/IC-ocd3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.55.68/IC3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.55.68/ICocd-3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.205.17.114/services/Imagecaching_v.3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.50.31.16/ffservice/IC-key-3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.205.17.114/services/IC-ocd-3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://172.22.10.91/IC3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.205.17.114/services/Imagecaching_v.3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.25.68/Imagecaching_v.3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.25.68/IC.3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.13.20.165/ImageCachingV2.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_AP/SnippetServices/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.205.17.114/services/IC-ocd-3.5/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.55.68/ICkey3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.205.17.114/services/ICkey3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.15.5.92/service/ICkey3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.200.225.28/IC.3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.200.225.28/ImageCachingV3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.200.168.14/IC.3.7-ocd/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.14.3.39/ImageCachingV3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.14.3.39/ic-3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.14.3.39/ic-ocd-3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.200.168.14/ImageCachingV3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.200.168.14/IC.3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps/service/snp-3.5-136/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.16.5.55/IC-Key-V3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.35.68/IC.3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.35.68/IC.3.7-ocd/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.35.68/IC_v.3.5/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.45.68/IC.3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.15.69/IC.3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://172.22.10.91/ICocdv.3.2/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://172.22.10.91/ICv.3.2/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.5.5.60/ICV3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.15.69/IC-ocd-3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.15.69/ICV3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.35.68/IC-ocd-3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.45.68/IC-ocd-3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.45.68/ImageCachingV3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.173.206.39/ICkey3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://172.22.10.91/ICkey3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.25.68/ICkey3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.200.168.14/ICkey3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.200.39.80/IC3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.5.5.60/ImageCachingV3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.13.20.165/ImageCaching_SB/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.13.20.165/ImageCaching_DBL/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.13.20.165/ImageCachingV2.1/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_GRPB/snippetkeyv2.2_grpfb/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.200.168.14/IC_v.3.5/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.15.55.180/service/ImageCachingV3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.55.68/ImageCachingV3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.25.68/ImageCachingV3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.35.68/ImageCachingV3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.15.68/ICV3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.15.68/IC-ocd-3.5/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.15.68/IC_V.3.5/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.15.68/IC-ocd-3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.55.68/IC-ocd-3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.55.68/ICV3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.25.68/IC-ocd-3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.55.69/ICocd-3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.55.69/IC3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.200.168.14/IC-ocd-3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.200.168.14/ICV3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.15.68/ICkey3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.55.69/ICkey3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.15.68/ICocd-3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.55.69/ICocd-3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.200.168.14/ICocd-3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.200.168.14/ICkey3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.26.207/Apps_GrpB/Snippetkeyv3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/service/ImageCaching_V3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.200.168.14/IC3.2/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/sp3.3/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.45.68/IC.3.7-ocd/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.25.68/IC.3.7-ocd/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.14.3.39/ICkey3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.16.5.55/ICkey3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.9.1.53/IC2.1/ImageCaching.asmx |GetDataset,CopyImage,GetImagev |
| http://10.9.1.53/IC3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.9.1.53/IC-ocd3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.20.38.47/ICkey3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.5.5.60/IC-ocd-2.1/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.15.68/ImageCachingV3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.5.5.60/ImageCachingV2.1/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.55.68/ImgCacheV3.0_Uz/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.205.17.114/services/ImageCaching3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.55.68/ICocd3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.45.68/ICkey3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://172.22.112.4/ICkey3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.45.68/ICocd3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.35.68/ICocd3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.25.68/ICocd3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://172.22.112.4/ICocd3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.15.69/ICocd3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://172.22.112.4/IC.3.7-ocd/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://172.22.112.4/ImageCachingV3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.200.39.80/ImageCachingV3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.55.68/ICkey3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.45.68/ICkey3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.15.68/ICkey3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.35.68/ICkey3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://172.22.112.4/Ickey3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.13.20.165/ICkey3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.25.68/IC.3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.200.225.28/ICkey3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.14.3.39/ICkey3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://172.22.10.91/IC.3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.16.5.55/ICkey3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.200.225.28/ICkey3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.15.69/ICkey3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://172.22.10.91/ICkey3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.5.5.60/ICkey3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.15.1.93/ICkey3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/snip_3.12/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.25.68/ICkey3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.200.39.80/ICkey3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.205.17.114/services/ICkey3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.15.1.93/ICkey3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.55.69/ICkey3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.13.20.165/ImageCachingV3.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.20.36.50/ImageCachingV1.7.6.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.15.5.41/ImageCachingV1.7.6.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.15.5.92/service/ICkey3.8/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://172.22.112.4/IC-Key-V3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.20.38.125/FFService/Imagecaching_v.3.9/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.35.68/ImageCachingV3.6/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.13.20.165/ImageCachingV2.3/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/testing/ImageCachingV1.6.0/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.18.15.68/ICocd-3.7_key/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://10.15.5.92/Service/IC3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|
| http://172.22.10.91/ICocd3.7/ImageCaching.asmx |GetDataset,CopyImage,GetImage|



@Yes
Scenario Outline: Datalocation service functionality checking
Given Call the Catching Service "<Datalocation Service>" and "<MethodName>"

Examples:
| Datalocation Service | MethodName |
| http://10.110.46.148/FFService/snip_3.10_4_E/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/snipOcd_3.10_E/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/snip_3.10_4_E/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/snipOcd_3.10_E/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/SnippetKey_V3.8/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/SnippetOcode_V3.5_New/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/SnippetKey_v.3.12/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/SnippetKey_V3.8_New/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/SN_3.12_1381/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/SnippetKey_V.3.9/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/SnippetOcode_V3.5/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/Snip_V3.12/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://Firefly.hovservices.com/FFService/SnippetKey_V.3.9/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://Firefly.hovservices.com/FFService/SnippetOcode_V3.5/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://Firefly.hovservices.com/FFService/Snip_V3.12/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.39/Service/SNKEY3.5_1.3.6.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH4539/SNKEY3.5_1.3.6.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_GrpB/SnippetKeytrn2.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.26.207/Apps_Ocoding/SnippetKeyV2.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://10.110.26.207/Apps_GrpB/SBSnippetKey/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps/SnippetKey_VBK/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.26.207/Apps_GrpB/SBSnippetKey/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.26.207/Apps_ocoding/OcodingSnippetkey/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.26.207/Apps-Nist/Services/snip_v.3.6/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/snip_3.10_crs/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH46148/SN_3.12_1381/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH46148/snip_3.10_crs/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_GrpB/SK3.5_1.3.6/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/apps/service/Sniptocde3.1_3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_grpb/SnippetServicev3.1_MKL/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps/service/snip_ocd_3.5_RP4.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_AP/SnippetKeyver2.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_GrpB/SBSnippetKey/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_Ocoding/SnippetOcodev3.3/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_Ocoding/SnippetOcod3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_Ocoding/SnippetOcod3.1-new/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_GrpB/SKeyv3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_GrpB/SnippetKeyv3.1_3.4.0.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_Ocoding/SnippetOcod3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/apps/service/Sniptocde3.1_3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_grpb/SnippetServicev3.1_MKL/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps/service/snip_ocd_3.5_RP4.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_Ocoding/SnippetOcodev3.3/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps/service/snp-3.5-136/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_ocoding/SnippetOcod3.1_3.7.0.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps/service/skey3.5_RP4.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_GrpB/SnippetKeyv3.1_3.4.0.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_ocoding/SnippetOcod3.1_3.7.0.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH1253/SnippetOdev3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.39/Service/SP3.9-3.7/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/SP3.9-3.7/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://Firefly.hovservices.com/WFH4539/SP3.9-3.7/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/SnippetServicev3.1_MKL/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/SnippetServicev3.1_MKL/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/Service/Snippet3.1_Uz/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.53.46/FFService/snip3.10-1351-4/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/snip3.10-1351-4/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.53.46/FFService/SN_3.12_4.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/SN_3.12_4.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/ffService/SnippetKey_V3.5_1.3.6/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/SnippetKey_V3.5_1.3.6/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/SnippetOcode_V3.5/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/SK-ocd3.5-1360/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/SK3.5/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/SK3.5/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/SK-ocd3.5-1360/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/Snipocode3.1_3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/Snipt3.1_3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/Snipocode3.1_3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/Snipt3.1_3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/Snipocd2.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/Snip2.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/Sniptocde3.1_3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/SnippetService_v.3.5/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/Snip2.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/SNK_3.13/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/Service/SnippetKeyUHC2.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.53.46/FFService/SN_3.13_1381/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH5346/SN_3.13_1381/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/SnippetKey_v.3.13/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/ffService/SnippetKey_V3.5_1.3.6/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://firefly.hovservices.com/ffService/SnippetKey_V3.5_1.3.6/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://Firefly.hovservices.com/FFService/SNIX_3.13/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/SnippetKey_V3.11_1.3.8.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/snip_3.10_N/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/snip_3.10/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_grpb/SnippetKeyv3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.39/Service/Snip3.9_1351/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH4539/Snip3.9_1351/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_GrpB/SBSnippetKey/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_grpb/newSnippetKey/SnippetKey.asmx |GetDataset,CopyImage,GetImage,CopyImage |
| http://10.110.26.207/Apps_Ocoding/SnippetOcodev3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://10.110.26.207/Apps_GrpB/SnippetKeyv3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_GrpB/Snippetkeyv3.1_new/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_GrpB/SnippetKeyV2.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.26.207/Apps/service/SnippetOcode_v.3.9/snippetkey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.26.207/Apps/service/Snippetkeyv.3.9/snippetkey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/service/SnippetOcode_V3.9/snippetkey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_GRPB/SKeyver3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_GrpB/SkeyV3.1_PRG/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/SnippetOcod3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/SKeyver3.1_New/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_Ocoding/SnippetOdev3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_GRPB/SKeyver3.1_New/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps/service/snipt_ocd_v.3.6/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps/service/SnippetKey_V3.5_1.3.5.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH1253/snp-3.5-136/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH1253/Snippetkeyv3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH1253/SkeyV3.1_PRG/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH4537/SnippetOcod3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH4537/SKeyver3.1_New/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH1253/snipt_ocd_v.3.6/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH1253/SnippetKey_V3.5_1.3.5.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/SkeyV3.1_PRG/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/Snipp_v.3.11/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/Snippocode_v.3.11/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH4537/Snipp_v.3.11/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH4537/Snippocode_v.3.11/snippetkey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.53.46/FFService/SN_3.13/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH5346/SN_3.13/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/snip-3.1-3.7/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/snip3.1_AAA_GIWL/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/snip3.1_AAA/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_GrpB/SnippetKeyv3.3_3.7.0.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps/service/snip-ocd-3.9_3.7.0.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_GrpB/SnippetKeyv3.3/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps/service/skey3.5_RP4.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps/service/snip-ocd-3.9/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_AP/SnippetKeyV2.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_AP/SnippetKeyv2.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/service/SnippetKeyver3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/Apps_Ocoding/SnippetOcod3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.53.46/FFService/snip_3.12/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.111.68.121/FFService/SnippetKey_v3.12_1381/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/apps-nist/services/Snip_v.3.5_1.3.6/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps/service/snpocd_3.5_den4.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps/service/snip-ocd-3.9_K2/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps/service/sniptkey_3.1_MKL/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps/service/snpkey3.5_RP4.0_E/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/service/SnippetOcode_V3.9_4.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/service/SnipOcd_v.3.5_4.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/service/SnippetKey_v.3.5/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/service/SnippetKey_V3.1_SS_V3.7/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/service/SnippetKey_v.3.5_4.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Snip_v.3.5_1.3.6/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/SN_3.13_1381/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.53.46/FFService/Snip_3.11_1381/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.39/Service/sp3.9-ocd/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.39/Service/sp3.9/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/SP3.9-3.7/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/SP3.9/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/sp3.9-ocd/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH4539/sp3.9-ocd/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH4539/sp3.9/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.39/Service/sp3.3/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.39/Service/spocd3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.39/Service/snipocd3.3/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/spocd3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.20.36.42/Apps/Service/snipt_v.3.6_3.7.0.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/3.10_1351/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH4537/3.10_1351/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/SN_3.13_1381_NEW/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/Snip_V3.11_F/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps/service/SN_OC_3.5/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps/service/snipt_v.3.6/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/snipt_v.3.6/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/snip3.5_RP4/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/snip3.5_AAA_GIWL/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/snip3.5_AAA_MLTA/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH4537/SK3.5/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_Ocoding/OcodingSnippetkey/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/snip_3.10_4.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/SN_3.13/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/SN_3.134537/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/snip_3.10/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/SnippetKey_v3.12_1381/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/SnippetKey_v3.12_13814537/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.20.36.71/service/Snippet3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_NYDTF/SnippetServicev3.1/snippetkey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/snip_3.10_4_F/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/snip_3.10_4_F/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.53.46/FFService/Snip_3.8_1360/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/Snip_3.8_1360/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_Ocoding/SKeyv1.9/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_Ocoding/SnippetKeyv2.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_Ocoding/SnippetService_v.3.5/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/snip3.8_1360/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/snip_3.10_3.7/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_Ocoding/snipocd3.3/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps/service/SK_Ocode3.5_1.3.6/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps/service/snipocd3.3/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/snp-3.5-136/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/SnippetKeyv3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/apps-nist/services/snip_3.10_1351/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_GrpB/Snippetkeyv3.1_3.7.0.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/apps-nist1/services/snip_V3.10_1351/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_GrpB/Snippetkeyv3.3/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/SnippetKey_V3.10_1351/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.111.68.121/FFService/snip_3.12/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_grpb/snip2.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_GrpB/SBSnippetkeyHPS/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_grpb/snip2.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.53.46/FFService/snip_3.11/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/snip_3.11/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.53.46/FFService/snip-ocd3.10-4/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/Snip_3.11_1381/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/snip-ocd3.10-4/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/snip_3.10_4.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.111.68.121/FFService/snip_3.11/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/snip_3.11/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/snip_3.11_New/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.39/Service/snip_3.12/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/SN_3.131381/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.53.46/FFService/snip_3.11-EMB/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.53.46/FFService/snip_3.11-umr/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH5346/snip_3.12/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/snip_3.12V/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.39/Service/snip_3.11/snippetkey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/snip_312/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.111.68.121/FFService/Snip_3.11_1381/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/Snip_3.11_1381_new/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.53.46/FFService/snip_3.11-wellmed/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/SN_3.13_1381_E/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH46148/SN_3.13_1381_E/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/apps-nist/services/SnippetKey_v3.12_1381/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/apps-nist/services/SnippetKey_v3.12_1381/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/SnippetKey_V3.11_1.3.8.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/SnippetOcode_V3.8_1360/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_GrpB/SP3.1_3.8.0.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_GrpB/SP3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/SnippetKeyv3.3/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/SN_3.13_1381/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.26.207/Apps_Ocoding/OcodingSnippetkey/V1.7.6/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_GrpB/SnippetKeyV2.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH46148/snip_3.10_4.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/SK3.12/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/snip3.8_136046148/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/ffservice/SnippetKey_V3.11/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/SnippetKey_V3.11/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/snip3.10-1351-4/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/snip3.10-1351-4/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/SnippetService_3.10/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.20.38.125/FFService/SnippetKey_v.3.12/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/apps-nist/services/SN_3.13/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/SN_3.13/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/service/Snippetkeyv3.3/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/APPS/service/SnippetKey_v.3.5_1.3.6/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/service/SnippetKeyver3.1_3.8.0.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/Apps/service/Snippet3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/Service/SnippetServicev3.1_MKL/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/Apps/service/Snip_V.3.5/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/Apps/service/snipocd_V.3.5/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/Apps/service/snip-3.5-136/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/Service/SnippetOcodev3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/Service/SnippetOcodev3.3/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/Service/SnippetKeyv3.3_RP_4.0.0.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/service/SnippetKeyver3.1_4.0.0.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/service/SnippetKeyver3.1.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/service/SnippetKeyv2.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/service/SnippetOcode_V3.5_1.3.5.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/service/SPKeyv3.3/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/service/SnippetKey_V3.1_RP_V4.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/Apps_ocoding/Snippet3.1_MKL_V4.0_RP/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/Service/Snip_3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/apps/service/snipt3.1_3.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/service/SnippetKey_V3.5_1.3.5.1/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/service/SnippetOcode_V3.6/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.106/Service/SnippetKey_V3.9/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.109/FFService/Snippet3.1-2.6.0.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.53.46/FFService/snip_3.10/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps-Nist/Services/snip_v.3.6/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.45.37/SBSnippetkey/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/SBSnippetkey4537/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/Apps_Ocoding/OcodingSnippetkey/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_GrpB/SnippetKey_V3.6_3.7/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_Ocoding/SnippetOcode_V2.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_Ocoding/snip-ocd-3.9/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_Ocoding/SnippetKeyV2.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps/service/snip_3.5/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps_GrpB/SnippetKey_V3.6_3.7E/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH1253/SnippetKeyv3.1_3.7.0.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH1253/OcodingSnippetkey/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH1253/SnippetOcodev3.3/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH1253/Snip_v.3.5_1.3.6/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH1253/SnippetKey_V3.6_3.7/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH1253/snip_ocd_3.5_RP4.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH1253/SnippetKeyv3.1_3.4.0.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH1253/SnippetOcode_V2.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH1253/snip-ocd-3.9/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH1253/SnippetKeyV2.0/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH1253/snip_3.5/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH1253/SnippetKey_V3.6_3.7E/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH1253/SN_OC_3.5/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/testing/DBLookup-App/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.12.53/Apps/service/snp3.1_3.5.1-tdb/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/SnippetKey_v3.12_1381/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://10.110.46.148/FFService/SnippetKey_V3.5_E/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH46148/snip3.5_E/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/WFH46148/snip_3.10_4_E/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| https://firefly.hovservices.com/FFService/skey3.5_RP4.0/snippetkey.asmx |GetDataset,CopyImage,GetImage|
| http://firefly.hovservices.com/FFService/snipt_v.3.6/SnippetKey.asmx |GetDataset,CopyImage,GetImage|
| http://firefly.hovservices.com/FFService/skey3.5_RP4.0/snippetkey.asmx |GetDataset,CopyImage,GetImage|





@No
Scenario: Login functionality checking
Given Navigate to URL "http://10.20.38.125/OpusFirefly/Home/Login"
Then enter username as "alakshmi" and password as "hai"
Then select Domain as "INDIALASON"
When Click Login button
Then title of the page should be "Firefly"


@No
Scenario: Dropdown functionality checking
Given Navigate to URL "http://10.20.38.125/OpusFirefly/Home/Login"
Then enter username as "alakshmi" and password as "hai"
Then select Domain as "INDIALASON"
When Click Login button
#Then title of the page should be "Firefly"
Then select items in the drop down as "OPUS-INVOICE-INNO,OPUS-INVOICE-SET3,OPUS-INVOICE-SET3_product,OPUS-NON-INVOICE,OPUS-product,Trinity_product"
#Then sendemail

@No
Scenario: Service URL functionality checking
Given Navigate to URL "http://10.20.38.47/FFService/snip3.10-1351-4/SnippetKey.asmx"
Then Check the method as "GetDataset,CopyImage,GetImage"



#@Yes
#Scenario: Mail Sending
#Then sendemail






























































































































#.............................................Smoke Test.........................................................

#Background:
#Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
#Then enter username as "admin6" and password as "Testpay@9"
#Then enter the captcha



@No
Scenario: Login functionality checking
When Click Login button
Then title of the page should be "BancHUB™"
@No
Scenario: Dashboard functionality checking
When Click Login button
Then select from date as "2"
When click on getdetails
Then transaction count should be displayed
@No
Scenario: Report functionality checking
When Click Login button
Then click on reports
Then click on payment report
When click on getreport button
Then system should display "Records not found"
@No
Scenario: Userprofile functionality checking	
When Click Login button
Then click on myprofile image
Then click on myprofile link
Then click on payment option
Then click on credit checkbox

#.............................................Login Module.........................................................

@No
Scenario: Validating buttons in Login page
Given Navigate to URL "http://10.20.38.125/banchubwebsite/"
When Click Login Button in Home Page
Then Check the Forgot button in the Login Page
Then Check the Signin button in the Login Page
Then Check the createuser button in the Login Page

@No
Scenario: Check Login Functionality
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
When Click Login button
Then title of the page should be "BancHUB"

@No
Scenario: Validating Whether Valid User ID and Invalid Password is processed
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@"
Then enter the captcha
When Click Login button
Then It shows error message as "Invalid credentials"

@No
Scenario: Validating whether Invalid User ID and Valid Password is processed
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin7" and password as "Testpay@9"
Then enter the captcha
When Click Login button
Then It shows error message as "Invalid credentials"

@No
Scenario: Validating Whether Valid User ID and Password and Invalid Captcha is processeds
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha1
When Click Login button
Then It shows red line message as "#ff4500"

@No
Scenario: Validating whether Forgot password redirects to reset password
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as ""
Then enter the captcha
When Click Forgotpassword button
Then it will redirect to Password reset page as "Forget Password"

@No
Scenario: Validating whether Forgot password redirects to reset password
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "testpay" and password as ""
Then enter the captcha
When Click Forgotpassword button
Then select the question as "What is your favorite visting place?"
Then give answer as "chennai"
Then select the questiontwo as "What is your favorite color?"
Then give answertwo as "chennai"
Then enter the captcha1
When click submit button
Then It shows red line message as "#ff4500"

@No
Scenario: Validating whether Tapping on "Create Account" takes to Creation of Business details page
Given Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then click create account link
Then check control moves to bussiness details link

@No
Scenario: Validating whether Tapping on "Business details" takes to Creation of Payment Options
Given Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then click create account link
Then enter organization name as "exela"
Then enter bussiness type as "Information Technology"
Then enter address as "103/102,Guindy,chennai"
Then enter zipcode as "632001"
Then enter phone "9175620558"
Then enter Email "senthilvelan.venugopal@exelaonline.com"
Then select country as "India"
Then click Next button

@No
Scenario: Validating whether Tapping on "Business details" takes to Creation of Payment Options
Given Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then click create account link
Then enter organization name as "exela"
Then enter bussiness type as "Information Technology"
Then enter address as "103/102,Guindy,chennai"
Then enter zipcode as "632001"
Then enter phone "9175620558"
Then enter Email "senthilvelan.venugopal@exelaonline.com"
Then select country as "India"
Then click Next button
Then check control will moves to Payment Option tap

@No
Scenario: Validating whether Tapping on "Payment Options" takes to Creation of Account setup
Given Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then click create account link
Then enter organization name as "exela"
Then enter bussiness type as "Information Technology"
Then enter address as "103/102,Guindy,chennai"
Then enter zipcode as "632001"
Then enter phone "9175620558"
Then enter Email "senthilvelan.venugopal@exelaonline.com"
Then select country as "India"
Then click Next button
Then select the payment option as "CreditCard"
Then enter server name as "exela server"
Then click payment option Next button
Then Check the control moves to Account Setup

@No
Scenario: Validating whether Tapping on "Payment Options" takes to Creation of Account setup
Given Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then click Home Page button
Then Check the control moves to Login page



#.....................................................Admin Module...............................................................



@No
Scenario: Validating whether all the Menu options in Banchub page is getting opened or not
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
When Click Login button
Then Check all the menu option opened in the page details or not

@No
Scenario: Validating whether Dashboard shows all the users details 2
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click the Dashboard
Then select the user as "TESTPAYMENT"
Then Click the Getdetails
When Get the total count of two tables as "EFTTransactionLog" and "EFTCardTransactionLog"
Then Compare the total count of db with total transaction

@No
Scenario: Check whether Registration details shows all the users with its selected entries per page 3
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click the Registration Details menu
Then and check the number of entries shown in the menu are matches with the tables as "eftuserregistration"

@No	
Scenario: Check whether an User status can be made Active 4
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click the Registration Details menu
Then select the user as "paymenttest" and "Cancelled"
When Select tick mark on the Action button
Then select the user as "paymenttest" and ""
Then Check the status as "Approved"



@No
Scenario: Check whether an User status can be made InActive 5
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click the Registration Details menu
Then select the user as "paymenttest" and "Approved"
When Select untick mark on the Cancel button
Then select the user as "paymenttest" and ""
Then Check the status as "Cancelled"



@No
Scenario: Check whether Remarks comments are getting updated to an User 6
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click the Registration Details menu
Then select the user as "paymenttest" and "Cancelled"
Then enter comments in the remarks section as "Welcome to Exela"
When Select untick mark on the Cancel button
Then select the user as "paymenttest" and "Cancelled"
Then Check the comments updated correctly or not as "Welcome to Exela"



@No
Scenario: Check whether the User can raise an ticket and the admin responds 7
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "mraja" and password as "Testpay@3"
Then enter the captcha
Then Click Login button
Then Click the Support Menu
#Then select the user as "TESTPAYMENT"
Then Create the ticket from merchant account with the following details as "Exela2" and "Thanks"
#Then click on myprofile image
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click the Support Menu in admin user
Then select the user as "TESTPAYMENT"
Then Click respond to the Merchant ticket as "Exela2" and "Approved"
#Then click on myprofile image

@No
Scenario: Check whether the Merchant receives the Admin response 8
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "mraja" and password as "Testpay@3"
Then enter the captcha
Then Click Login button
Then Click the Support Menu
Then Check respond from the admin as "Exela2 ......." and "Approved"



@No
Scenario: Check whether tapping on Menu button can minimize its menu bar options 9
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Tab the Menu Button
Then Menu bar option shuold get minimized and Maximized



@No
Scenario: Check whether the Gateway details shows its required attributes 10
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click Under Gateway details and check Payment details,Payment Type,Gateway details,Gateway payment type and Gateway services



@No
Scenario: Check whether the Payment details shows the existing payment transaction details 11
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Select Payment Details Link
Then and check the number of entries shown in the menu are matches with the tables "EFTPaymentTypeMaster"
#Then Compare the total count of db with total transaction
#Then Check List of existing payment details should be seen



@No
Scenario: Check whether the Search bar is seen in Payment details 12
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Select Payment Details Link
Then Check List of existing payment details should be seen
Then Search a specifc transaction user details in search bar



@No
Scenario: Check whether the page navigator is seen in Payment details page 13
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Navigate to next page by selecting the specific page in Page navigator



@No
Scenario: Check whether Payment type as per its table count 14
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Select Payment Details Link
Then select the user
Then Compare count of table EFTPaymentTypeMaster with payment type count


@No
Scenario: Check whether Payment type can be made Active 15
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click the Payment Details menu
Then select the user
Then Click tick mark in the Action
Then Check the status as "Active"



@No
Scenario: Check whether Payment type can be made InActive 16
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click the Payment Details menu
Then select the user
Then Click Uncheck button in the Action
Then Check the status as "InActive"



@No
Scenario: Check whether a New Payment type can be added 17
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click the Payment Details menu
Then Click New to create new user
Then Enter payment type details and save it
Then Check the created user added in the table or not



@No
Scenario: Check whether Payment type as per its table count 18
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click the Payment Details menu
Then Check the total count of EFTPaymentOptionMaster with Payment details count



@No
Scenario: Check whether Payment option can be made Active 19
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Check the Payment Option menu
Then Click Tick mark on the Action
Then Check the status as "Active"



@No
Scenario: Check whether Payment option can be made InActive 20
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Check the Payment Option menu
Then Click Tick mark on the Action
Then Check the status as "InActive"



@No
Scenario: Check whether a New Payment option can be added 21
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click the Payment Option menu
Then Click New to create new user
Then Enter payment type and Payment Option details and save it
Then Check the created user added in the table or not



@No
Scenario: Check whether Gateway details can be made Active 22
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click Gateway Details
Then Select Gateway
Then Click Tick mark in the Action
Then Check the status as "Active"



@No
Scenario: Check whether Gateway details can be made InActive 23
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click Gateway Details
Then Select Gateway
Then Click Tick mark in the Action
Then Check the status as "InActive"



@No
Scenario: Check whether a Gateway Details option can be added 24
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click the Gateway Details menu
Then Click New to create new user
Then Enter Gateway details and save it
Then Check the created user added in the table or not



@No
Scenario: Check whether the page navigator is seen in Gateway details page 24
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click Gateway detail menu
Then Check the Navigatior is working fine or not



@No
Scenario: Check whether the page navigator is seen in Gateway details page 25
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click Gateway detail menu
Then Try to edit and go to state section
Then Try to give a space in between texts in it
Then Check the space allowed in it



@No
Scenario: Check whether it accepts only numericals 26
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click Gateway detail menu
Then Select the New
Then Check the phone number field should allow only Numbers



@No
Scenario: Check whether Gateway details accepts only 100 characters in Business name text box 26
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click Gateway detail menu
Then Select the New
Then Check the Busssines name box field should allow only 100 characters 



@No
Scenario: Check whether Payment type as per its table count 27
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click Gateway Payment Type
Then Check the total count of EFTGatewayPaymentType with Gateway payment type total count


@No
Scenario: Check whether Gateway Payment type can be made Active 28
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click Gateway Payment Type
Then Click the Tick mark in the Action
Then Check the status as "Active"



@No
Scenario: Check whether Gateway Payment type can be made InActive 29
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click Gateway Payment Type
Then Click Uncheck in the Action
Then Check the status as "InActive"



@No
Scenario: Check whether a New Gateway Payment Type can be added 30
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click Gateway Payment Type
Then Select the New
Then Enter the details all required and save it
Then Check the New Payment type can be added in the table 


@No
Scenario: Check whether the Search bar is seen in Gateway Payment Type  details 31
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click Gateway Payment Type
Then Search the specific user in the search bar
Then To Check the user pick from the list or not 



@No
Scenario: Check whether the page navigator is seen in Gateway Payment type page 32
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click Gateway Payment Type
Then Check the Navigatior is working fine or not



@No
Scenario: Check whether it accepts only Alphabets n numericals 33
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click Gateway detail menu
Then Edit the existing user and check if its allowed only alphabets and Numericals and save it
Then Check the status its allows only Alphabets and Numericals



@No
Scenario: Check whether Gateway payment type table should show only exact number of entries which is present in the table 34
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click Gateway Payment Type
Then Compare total count of EFTGatewayPaymentType with Gateway payment type total count
Then Click the New
Then Enter the details for all required fields and save it
Then Compare total count of EFTGatewayPaymentType with Gateway payment type total count 



@No
Scenario: Check whether the Payment option indication text is seen in New creation page  35
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click Gateway Payment Type
Then Select the New
Then Check the text show in the creation page as "Payment option"



@No
Scenario: Check whether Gateway Payment Service as per its table count 36
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click Gateway Payment Service
Then Check the total count of EFTGatewayServices with Gateway Payment Service total count



@No
Scenario: Check whether Gateway Service names can be made Active 37
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click the Gateway Service
Then Click the Tick mark in the Action
Then Check the status as "Active"



@No
Scenario: Check whether Gateway Service names can be made InActive 38
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click the Gateway Service
Then Click Uncheck in the Action
Then Check the status as "InActive"



@No
Scenario: Check whether a New Gateway Payment Type can be added 39
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click the Gateway Service
Then Select the New
Then Enter the details for required field and save it
Then Compare the total count of EFTGatewayServices with Gateway Services total count



@No
Scenario: Check whether the Search bar is seen in Gateway Services 40
Given  Navigate to URL "http://10.20.38.125/BancHubWebSite/SignIn"
Then enter username as "admin6" and password as "Testpay@9"
Then enter the captcha
Then Click Login button
Then Click the Gateway Service
Then Search the specific user in the search bar
Then To Check the user pick from the list or not



@No
Scenario: Check whether the Search bar is seen in Gateway Services 40
Given  Navigate to URL "http://10.20.38.125/BanchubAccount/Payment/GatewayService"
Then Click the Gateway Service
Then Enter the details for required fileds
Then Check its allows unknown alphanumeic values without https
