public class com.mobfox.video.sdk.ResponseHandler extends org.xml.sax.helpers.DefaultHandler {
	 /* .source "ResponseHandler.java" */
	 /* # instance fields */
	 private java.io.CharArrayWriter contents;
	 private Long currentExpiration;
	 private com.mobfox.video.sdk.TrackerData currentTracker;
	 private Boolean insideInterstitial;
	 private Boolean insideMarkup;
	 private Boolean insideVideo;
	 private Boolean insideVideoList;
	 com.mobfox.video.sdk.RichMediaAdData richMediaAd;
	 java.util.HashMap videoList;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/Long;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.mobfox.video.sdk.ResponseHandler ( ) {
/* .locals 2 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 13 */
/* invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V */
/* .line 17 */
this.richMediaAd = v0;
/* .line 19 */
this.videoList = v0;
/* .line 23 */
/* new-instance v0, Ljava/io/CharArrayWriter; */
/* invoke-direct {v0}, Ljava/io/CharArrayWriter;-><init>()V */
this.contents = v0;
/* .line 24 */
/* new-instance v0, Lcom/mobfox/video/sdk/TrackerData; */
/* invoke-direct {v0}, Lcom/mobfox/video/sdk/TrackerData;-><init>()V */
this.currentTracker = v0;
/* .line 27 */
/* iput-boolean v1, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideMarkup:Z */
/* .line 28 */
/* iput-boolean v1, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideVideo:Z */
/* .line 29 */
/* iput-boolean v1, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideInterstitial:Z */
/* .line 30 */
/* iput-boolean v1, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideVideoList:Z */
/* .line 13 */
return;
} // .end method
private Boolean getBoolean ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "text" # Ljava/lang/String; */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 570 */
/* if-nez p1, :cond_1 */
/* .line 578 */
} // :cond_0
} // :goto_0
/* .line 574 */
} // :cond_1
try { // :try_start_0
java.lang.Integer .parseInt ( p1 );
/* :try_end_0 */
v1 = /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* if-lez v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 575 */
/* :catch_0 */
/* move-exception v1 */
} // .end method
private Integer getInteger ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "text" # Ljava/lang/String; */
/* .prologue */
int v0 = -1; // const/4 v0, -0x1
/* .line 546 */
/* if-nez p1, :cond_0 */
/* .line 554 */
} // :goto_0
/* .line 550 */
} // :cond_0
try { // :try_start_0
java.lang.Integer .parseInt ( p1 );
/* :try_end_0 */
v0 = /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 551 */
/* :catch_0 */
/* move-exception v1 */
} // .end method
private Long getLong ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "text" # Ljava/lang/String; */
/* .prologue */
/* const-wide/16 v0, -0x1 */
/* .line 558 */
/* if-nez p1, :cond_0 */
/* .line 566 */
} // :goto_0
/* return-wide v0 */
/* .line 562 */
} // :cond_0
try { // :try_start_0
java.lang.Long .parseLong ( p1 );
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-result-wide v0 */
/* .line 563 */
/* :catch_0 */
/* move-exception v2 */
} // .end method
/* # virtual methods */
public void characters ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p1, "ch" # [C */
/* .param p2, "start" # I */
/* .param p3, "length" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 35 */
v0 = this.contents;
(( java.io.CharArrayWriter ) v0 ).write ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Ljava/io/CharArrayWriter;->write([CII)V
/* .line 36 */
return;
} // .end method
public void endElement ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 8 */
/* .param p1, "uri" # Ljava/lang/String; */
/* .param p2, "localName" # Ljava/lang/String; */
/* .param p3, "qName" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .prologue */
int v7 = 0; // const/4 v7, 0x0
/* .line 41 */
final String v4 = "creative"; // const-string v4, "creative"
v4 = (( java.lang.String ) p2 ).equals ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 42 */
v4 = this.richMediaAd;
if ( v4 != null) { // if-eqz v4, :cond_0
v4 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v4 ).getVideo ( ); // invoke-virtual {v4}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* if-nez v4, :cond_1 */
/* .line 43 */
} // :cond_0
/* new-instance v4, Lorg/xml/sax/SAXException; */
final String v5 = "Creative tag found outside video node"; // const-string v5, "Creative tag found outside video node"
/* invoke-direct {v4, v5}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v4 */
/* .line 45 */
} // :cond_1
v4 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v4 ).getVideo ( ); // invoke-virtual {v4}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* .line 46 */
/* .local v3, "video":Lcom/mobfox/video/sdk/VideoData; */
v4 = this.contents;
(( java.io.CharArrayWriter ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/io/CharArrayWriter;->toString()Ljava/lang/String;
this.videoUrl = v4;
/* .line 129 */
} // .end local v3 # "video":Lcom/mobfox/video/sdk/VideoData;
} // :cond_2
} // :goto_0
return;
/* .line 47 */
} // :cond_3
final String v4 = "duration"; // const-string v4, "duration"
v4 = (( java.lang.String ) p2 ).equals ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 48 */
v4 = this.richMediaAd;
if ( v4 != null) { // if-eqz v4, :cond_4
v4 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v4 ).getVideo ( ); // invoke-virtual {v4}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* if-nez v4, :cond_5 */
/* .line 49 */
} // :cond_4
/* new-instance v4, Lorg/xml/sax/SAXException; */
final String v5 = "Duration tag found outside video node"; // const-string v5, "Duration tag found outside video node"
/* invoke-direct {v4, v5}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v4 */
/* .line 51 */
} // :cond_5
v4 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v4 ).getVideo ( ); // invoke-virtual {v4}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* .line 52 */
/* .restart local v3 # "video":Lcom/mobfox/video/sdk/VideoData; */
v4 = this.contents;
(( java.io.CharArrayWriter ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/io/CharArrayWriter;->toString()Ljava/lang/String;
(( java.lang.String ) v4 ).trim ( ); // invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
v4 = /* invoke-direct {p0, v4}, Lcom/mobfox/video/sdk/ResponseHandler;->getInteger(Ljava/lang/String;)I */
/* iput v4, v3, Lcom/mobfox/video/sdk/VideoData;->duration:I */
/* .line 53 */
} // .end local v3 # "video":Lcom/mobfox/video/sdk/VideoData;
} // :cond_6
final String v4 = "tracker"; // const-string v4, "tracker"
v4 = (( java.lang.String ) p2 ).equals ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_a
/* .line 54 */
v4 = this.richMediaAd;
if ( v4 != null) { // if-eqz v4, :cond_7
v4 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v4 ).getVideo ( ); // invoke-virtual {v4}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* if-nez v4, :cond_8 */
/* .line 55 */
} // :cond_7
/* new-instance v4, Lorg/xml/sax/SAXException; */
final String v5 = "Tracker tag found outside video node"; // const-string v5, "Tracker tag found outside video node"
/* invoke-direct {v4, v5}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v4 */
/* .line 57 */
} // :cond_8
v4 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v4 ).getVideo ( ); // invoke-virtual {v4}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* .line 58 */
/* .restart local v3 # "video":Lcom/mobfox/video/sdk/VideoData; */
v4 = this.currentTracker;
v5 = this.contents;
(( java.io.CharArrayWriter ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/io/CharArrayWriter;->toString()Ljava/lang/String;
(( java.lang.String ) v5 ).trim ( ); // invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;
this.url = v5;
/* .line 59 */
int v1 = 0; // const/4 v1, 0x0
/* .line 60 */
/* .local v1, "trackers":Ljava/util/Vector;, "Ljava/util/Vector<Ljava/lang/String;>;" */
v4 = this.currentTracker;
/* iget v4, v4, Lcom/mobfox/video/sdk/TrackerData;->type:I */
/* packed-switch v4, :pswitch_data_0 */
/* .line 98 */
} // :cond_9
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 99 */
v4 = this.currentTracker;
v4 = this.url;
(( java.util.Vector ) v1 ).add ( v4 ); // invoke-virtual {v1, v4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
/* .line 65 */
/* :pswitch_0 */
v4 = this.timeTrackingEvents;
/* .line 66 */
v5 = this.currentTracker;
/* iget v5, v5, Lcom/mobfox/video/sdk/TrackerData;->time:I */
java.lang.Integer .valueOf ( v5 );
(( java.util.HashMap ) v4 ).get ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
} // .end local v1 # "trackers":Ljava/util/Vector;, "Ljava/util/Vector<Ljava/lang/String;>;"
/* check-cast v1, Ljava/util/Vector; */
/* .line 67 */
/* .restart local v1 # "trackers":Ljava/util/Vector;, "Ljava/util/Vector<Ljava/lang/String;>;" */
/* if-nez v1, :cond_9 */
/* .line 68 */
/* new-instance v1, Ljava/util/Vector; */
} // .end local v1 # "trackers":Ljava/util/Vector;, "Ljava/util/Vector<Ljava/lang/String;>;"
/* invoke-direct {v1}, Ljava/util/Vector;-><init>()V */
/* .line 69 */
/* .restart local v1 # "trackers":Ljava/util/Vector;, "Ljava/util/Vector<Ljava/lang/String;>;" */
v4 = this.timeTrackingEvents;
v5 = this.currentTracker;
/* iget v5, v5, Lcom/mobfox/video/sdk/TrackerData;->time:I */
java.lang.Integer .valueOf ( v5 );
(( java.util.HashMap ) v4 ).put ( v5, v1 ); // invoke-virtual {v4, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 74 */
/* :pswitch_1 */
v1 = this.startEvents;
/* .line 75 */
/* .line 77 */
/* :pswitch_2 */
v1 = this.completeEvents;
/* .line 78 */
/* .line 80 */
/* :pswitch_3 */
v1 = this.pauseEvents;
/* .line 81 */
/* .line 83 */
/* :pswitch_4 */
v1 = this.unpauseEvents;
/* .line 84 */
/* .line 86 */
/* :pswitch_5 */
v1 = this.muteEvents;
/* .line 87 */
/* .line 89 */
/* :pswitch_6 */
v1 = this.unmuteEvents;
/* .line 90 */
/* .line 92 */
/* :pswitch_7 */
v1 = this.replayEvents;
/* .line 93 */
/* .line 95 */
/* :pswitch_8 */
v1 = this.skipEvents;
/* .line 101 */
} // .end local v1 # "trackers":Ljava/util/Vector;, "Ljava/util/Vector<Ljava/lang/String;>;"
} // .end local v3 # "video":Lcom/mobfox/video/sdk/VideoData;
} // :cond_a
final String v4 = "htmloverlay"; // const-string v4, "htmloverlay"
v4 = (( java.lang.String ) p2 ).equals ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_d
/* .line 102 */
v4 = this.richMediaAd;
if ( v4 != null) { // if-eqz v4, :cond_b
v4 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v4 ).getVideo ( ); // invoke-virtual {v4}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* if-nez v4, :cond_c */
/* .line 103 */
} // :cond_b
/* new-instance v4, Lorg/xml/sax/SAXException; */
/* .line 104 */
final String v5 = "htmloverlay tag found outside video node"; // const-string v5, "htmloverlay tag found outside video node"
/* .line 103 */
/* invoke-direct {v4, v5}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v4 */
/* .line 106 */
} // :cond_c
v4 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v4 ).getVideo ( ); // invoke-virtual {v4}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* .line 107 */
/* .restart local v3 # "video":Lcom/mobfox/video/sdk/VideoData; */
v4 = this.contents;
(( java.io.CharArrayWriter ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/io/CharArrayWriter;->toString()Ljava/lang/String;
this.htmlOverlayMarkup = v4;
/* .line 108 */
/* iput-boolean v7, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideMarkup:Z */
/* goto/16 :goto_0 */
/* .line 109 */
} // .end local v3 # "video":Lcom/mobfox/video/sdk/VideoData;
} // :cond_d
final String v4 = "video"; // const-string v4, "video"
v4 = (( java.lang.String ) p2 ).equals ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_f
/* .line 110 */
/* iget-boolean v4, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideVideoList:Z */
if ( v4 != null) { // if-eqz v4, :cond_e
/* .line 111 */
v4 = this.contents;
(( java.io.CharArrayWriter ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/io/CharArrayWriter;->toString()Ljava/lang/String;
(( java.lang.String ) v4 ).trim ( ); // invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 112 */
/* .local v2, "url":Ljava/lang/String; */
v4 = this.videoList;
/* iget-wide v5, p0, Lcom/mobfox/video/sdk/ResponseHandler;->currentExpiration:J */
java.lang.Long .valueOf ( v5,v6 );
(( java.util.HashMap ) v4 ).put ( v2, v5 ); // invoke-virtual {v4, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 114 */
} // .end local v2 # "url":Ljava/lang/String;
} // :cond_e
/* iput-boolean v7, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideVideo:Z */
/* goto/16 :goto_0 */
/* .line 115 */
} // :cond_f
final String v4 = "interstitial"; // const-string v4, "interstitial"
v4 = (( java.lang.String ) p2 ).equals ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_10
/* .line 116 */
/* iput-boolean v7, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideInterstitial:Z */
/* goto/16 :goto_0 */
/* .line 117 */
} // :cond_10
final String v4 = "markup"; // const-string v4, "markup"
v4 = (( java.lang.String ) p2 ).equals ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_13
/* .line 118 */
v4 = this.richMediaAd;
if ( v4 != null) { // if-eqz v4, :cond_11
/* .line 119 */
v4 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v4 ).getInterstitial ( ); // invoke-virtual {v4}, Lcom/mobfox/video/sdk/RichMediaAdData;->getInterstitial()Lcom/mobfox/video/sdk/InterstitialData;
/* if-nez v4, :cond_12 */
/* .line 120 */
} // :cond_11
/* new-instance v4, Lorg/xml/sax/SAXException; */
/* .line 121 */
final String v5 = "markup tag found outside interstitial node"; // const-string v5, "markup tag found outside interstitial node"
/* .line 120 */
/* invoke-direct {v4, v5}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v4 */
/* .line 123 */
} // :cond_12
/* iput-boolean v7, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideMarkup:Z */
/* .line 124 */
v4 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v4 ).getInterstitial ( ); // invoke-virtual {v4}, Lcom/mobfox/video/sdk/RichMediaAdData;->getInterstitial()Lcom/mobfox/video/sdk/InterstitialData;
/* .line 125 */
/* .local v0, "inter":Lcom/mobfox/video/sdk/InterstitialData; */
v4 = this.contents;
(( java.io.CharArrayWriter ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/io/CharArrayWriter;->toString()Ljava/lang/String;
this.interstitialMarkup = v4;
/* goto/16 :goto_0 */
/* .line 126 */
} // .end local v0 # "inter":Lcom/mobfox/video/sdk/InterstitialData;
} // :cond_13
final String v4 = "error"; // const-string v4, "error"
v4 = (( java.lang.String ) p2 ).equals ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 127 */
v4 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v4 ).setType ( v7 ); // invoke-virtual {v4, v7}, Lcom/mobfox/video/sdk/RichMediaAdData;->setType(I)V
/* goto/16 :goto_0 */
/* .line 60 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_5 */
/* :pswitch_6 */
/* :pswitch_8 */
/* :pswitch_7 */
} // .end packed-switch
} // .end method
public void startDocument ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 133 */
/* new-instance v0, Lcom/mobfox/video/sdk/RichMediaAdData; */
/* invoke-direct {v0}, Lcom/mobfox/video/sdk/RichMediaAdData;-><init>()V */
this.richMediaAd = v0;
/* .line 134 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideVideoList:Z */
/* .line 135 */
return;
} // .end method
public void startElement ( java.lang.String p0, java.lang.String p1, java.lang.String p2, org.xml.sax.Attributes p3 ) {
/* .locals 15 */
/* .param p1, "uri" # Ljava/lang/String; */
/* .param p2, "localName" # Ljava/lang/String; */
/* .param p3, "qName" # Ljava/lang/String; */
/* .param p4, "attributes" # Lorg/xml/sax/Attributes; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 140 */
/* iget-boolean v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideMarkup:Z */
/* if-nez v11, :cond_0 */
/* .line 141 */
v11 = this.contents;
(( java.io.CharArrayWriter ) v11 ).reset ( ); // invoke-virtual {v11}, Ljava/io/CharArrayWriter;->reset()V
/* .line 142 */
final String v11 = "activevideolist"; // const-string v11, "activevideolist"
/* move-object/from16 v0, p2 */
v11 = (( java.lang.String ) v0 ).equals ( v11 ); // invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_1
/* .line 143 */
/* new-instance v11, Ljava/util/HashMap; */
/* invoke-direct {v11}, Ljava/util/HashMap;-><init>()V */
this.videoList = v11;
/* .line 144 */
int v11 = 1; // const/4 v11, 0x1
/* iput-boolean v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideVideoList:Z */
/* .line 543 */
} // :cond_0
} // :goto_0
return;
/* .line 145 */
} // :cond_1
final String v11 = "ad"; // const-string v11, "ad"
/* move-object/from16 v0, p2 */
v11 = (( java.lang.String ) v0 ).equals ( v11 ); // invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_d
/* .line 146 */
final String v11 = "type"; // const-string v11, "type"
/* move-object/from16 v0, p4 */
/* .line 147 */
/* .local v8, "type":Ljava/lang/String; */
final String v11 = "video-to-interstitial"; // const-string v11, "video-to-interstitial"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_2
/* .line 148 */
v11 = this.richMediaAd;
int v12 = 1; // const/4 v12, 0x1
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).setType ( v12 ); // invoke-virtual {v11, v12}, Lcom/mobfox/video/sdk/RichMediaAdData;->setType(I)V
/* .line 160 */
} // :goto_1
final String v11 = "animation"; // const-string v11, "animation"
/* move-object/from16 v0, p4 */
/* .line 161 */
/* .local v1, "animation":Ljava/lang/String; */
final String v11 = "fade-in"; // const-string v11, "fade-in"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v11, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_7
/* .line 162 */
v11 = this.richMediaAd;
int v12 = 1; // const/4 v12, 0x1
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).setAnimation ( v12 ); // invoke-virtual {v11, v12}, Lcom/mobfox/video/sdk/RichMediaAdData;->setAnimation(I)V
/* .line 149 */
} // .end local v1 # "animation":Ljava/lang/String;
} // :cond_2
final String v11 = "interstitial-to-video"; // const-string v11, "interstitial-to-video"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_3
/* .line 150 */
v11 = this.richMediaAd;
int v12 = 4; // const/4 v12, 0x4
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).setType ( v12 ); // invoke-virtual {v11, v12}, Lcom/mobfox/video/sdk/RichMediaAdData;->setType(I)V
/* .line 151 */
} // :cond_3
final String v11 = "video"; // const-string v11, "video"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_4
/* .line 152 */
v11 = this.richMediaAd;
int v12 = 2; // const/4 v12, 0x2
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).setType ( v12 ); // invoke-virtual {v11, v12}, Lcom/mobfox/video/sdk/RichMediaAdData;->setType(I)V
/* .line 153 */
} // :cond_4
final String v11 = "interstitial"; // const-string v11, "interstitial"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_5
/* .line 154 */
v11 = this.richMediaAd;
int v12 = 3; // const/4 v12, 0x3
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).setType ( v12 ); // invoke-virtual {v11, v12}, Lcom/mobfox/video/sdk/RichMediaAdData;->setType(I)V
/* .line 155 */
} // :cond_5
final String v11 = "noAd"; // const-string v11, "noAd"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_6
/* .line 156 */
v11 = this.richMediaAd;
int v12 = 0; // const/4 v12, 0x0
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).setType ( v12 ); // invoke-virtual {v11, v12}, Lcom/mobfox/video/sdk/RichMediaAdData;->setType(I)V
/* .line 158 */
} // :cond_6
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* new-instance v12, Ljava/lang/StringBuilder; */
final String v13 = "Unknown response type "; // const-string v13, "Unknown response type "
/* invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v12 ).append ( v8 ); // invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 163 */
/* .restart local v1 # "animation":Ljava/lang/String; */
} // :cond_7
final String v11 = "slide-in-top"; // const-string v11, "slide-in-top"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v11, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_8
/* .line 164 */
v11 = this.richMediaAd;
/* .line 165 */
int v12 = 2; // const/4 v12, 0x2
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).setAnimation ( v12 ); // invoke-virtual {v11, v12}, Lcom/mobfox/video/sdk/RichMediaAdData;->setAnimation(I)V
/* goto/16 :goto_0 */
/* .line 166 */
} // :cond_8
final String v11 = "slide-in-bottom"; // const-string v11, "slide-in-bottom"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v11, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_9
/* .line 167 */
v11 = this.richMediaAd;
/* .line 168 */
int v12 = 3; // const/4 v12, 0x3
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).setAnimation ( v12 ); // invoke-virtual {v11, v12}, Lcom/mobfox/video/sdk/RichMediaAdData;->setAnimation(I)V
/* goto/16 :goto_0 */
/* .line 169 */
} // :cond_9
final String v11 = "slide-in-left"; // const-string v11, "slide-in-left"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v11, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_a
/* .line 170 */
v11 = this.richMediaAd;
/* .line 171 */
int v12 = 4; // const/4 v12, 0x4
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).setAnimation ( v12 ); // invoke-virtual {v11, v12}, Lcom/mobfox/video/sdk/RichMediaAdData;->setAnimation(I)V
/* goto/16 :goto_0 */
/* .line 172 */
} // :cond_a
final String v11 = "slide-in-right"; // const-string v11, "slide-in-right"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v11, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_b
/* .line 173 */
v11 = this.richMediaAd;
/* .line 174 */
int v12 = 5; // const/4 v12, 0x5
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).setAnimation ( v12 ); // invoke-virtual {v11, v12}, Lcom/mobfox/video/sdk/RichMediaAdData;->setAnimation(I)V
/* goto/16 :goto_0 */
/* .line 175 */
} // :cond_b
final String v11 = "flip-in"; // const-string v11, "flip-in"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v11, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_c
/* .line 176 */
v11 = this.richMediaAd;
int v12 = 6; // const/4 v12, 0x6
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).setAnimation ( v12 ); // invoke-virtual {v11, v12}, Lcom/mobfox/video/sdk/RichMediaAdData;->setAnimation(I)V
/* goto/16 :goto_0 */
/* .line 178 */
} // :cond_c
v11 = this.richMediaAd;
int v12 = 0; // const/4 v12, 0x0
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).setAnimation ( v12 ); // invoke-virtual {v11, v12}, Lcom/mobfox/video/sdk/RichMediaAdData;->setAnimation(I)V
/* goto/16 :goto_0 */
/* .line 180 */
} // .end local v1 # "animation":Ljava/lang/String;
} // .end local v8 # "type":Ljava/lang/String;
} // :cond_d
final String v11 = "video"; // const-string v11, "video"
/* move-object/from16 v0, p2 */
v11 = (( java.lang.String ) v0 ).equals ( v11 ); // invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_13
/* .line 181 */
/* iget-boolean v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideVideoList:Z */
if ( v11 != null) { // if-eqz v11, :cond_e
/* .line 183 */
final String v11 = "expiration"; // const-string v11, "expiration"
/* move-object/from16 v0, p4 */
/* .line 182 */
/* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getLong(Ljava/lang/String;)J */
/* move-result-wide v11 */
/* .line 183 */
/* const-wide/16 v13, 0x3e8 */
/* mul-long/2addr v11, v13 */
/* .line 182 */
/* iput-wide v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->currentExpiration:J */
/* goto/16 :goto_0 */
/* .line 185 */
} // :cond_e
int v11 = 1; // const/4 v11, 0x1
/* iput-boolean v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideVideo:Z */
/* .line 186 */
/* new-instance v10, Lcom/mobfox/video/sdk/VideoData; */
/* invoke-direct {v10}, Lcom/mobfox/video/sdk/VideoData;-><init>()V */
/* .line 187 */
/* .local v10, "video":Lcom/mobfox/video/sdk/VideoData; */
final String v11 = "orientation"; // const-string v11, "orientation"
/* move-object/from16 v0, p4 */
/* .line 188 */
/* .local v6, "orientation":Ljava/lang/String; */
final String v11 = "landscape"; // const-string v11, "landscape"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v6 ); // invoke-virtual {v11, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_f
/* .line 189 */
int v11 = 0; // const/4 v11, 0x0
/* iput v11, v10, Lcom/mobfox/video/sdk/VideoData;->orientation:I */
/* .line 195 */
} // :goto_2
v11 = this.richMediaAd;
if ( v11 != null) { // if-eqz v11, :cond_12
/* .line 196 */
v11 = this.richMediaAd;
v11 = (( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getType ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getType()I
int v12 = 3; // const/4 v12, 0x3
/* if-ne v11, v12, :cond_11 */
/* .line 197 */
v11 = this.richMediaAd;
v11 = (( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getType ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getType()I
int v12 = 4; // const/4 v12, 0x4
/* if-eq v11, v12, :cond_11 */
/* .line 198 */
v11 = this.richMediaAd;
v11 = (( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getType ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getType()I
int v12 = 1; // const/4 v12, 0x1
/* if-eq v11, v12, :cond_11 */
/* .line 199 */
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 200 */
/* new-instance v12, Ljava/lang/StringBuilder; */
final String v13 = "Found Video tag in an interstitial ad:"; // const-string v13, "Found Video tag in an interstitial ad:"
/* invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 201 */
v13 = this.richMediaAd;
v13 = (( com.mobfox.video.sdk.RichMediaAdData ) v13 ).getType ( ); // invoke-virtual {v13}, Lcom/mobfox/video/sdk/RichMediaAdData;->getType()I
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 200 */
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 199 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 190 */
} // :cond_f
final String v11 = "portrait"; // const-string v11, "portrait"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v6 ); // invoke-virtual {v11, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_10
/* .line 191 */
int v11 = 1; // const/4 v11, 0x1
/* iput v11, v10, Lcom/mobfox/video/sdk/VideoData;->orientation:I */
/* .line 193 */
} // :cond_10
int v11 = 0; // const/4 v11, 0x0
/* iput v11, v10, Lcom/mobfox/video/sdk/VideoData;->orientation:I */
/* .line 203 */
} // :cond_11
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).setVideo ( v10 ); // invoke-virtual {v11, v10}, Lcom/mobfox/video/sdk/RichMediaAdData;->setVideo(Lcom/mobfox/video/sdk/VideoData;)V
/* goto/16 :goto_0 */
/* .line 205 */
} // :cond_12
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 206 */
final String v12 = "Video tag found outside document root"; // const-string v12, "Video tag found outside document root"
/* .line 205 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 209 */
} // .end local v6 # "orientation":Ljava/lang/String;
} // .end local v10 # "video":Lcom/mobfox/video/sdk/VideoData;
} // :cond_13
final String v11 = "interstitial"; // const-string v11, "interstitial"
/* move-object/from16 v0, p2 */
v11 = (( java.lang.String ) v0 ).equals ( v11 ); // invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_1e
/* .line 210 */
int v11 = 1; // const/4 v11, 0x1
/* iput-boolean v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideInterstitial:Z */
/* .line 211 */
/* new-instance v5, Lcom/mobfox/video/sdk/InterstitialData; */
/* invoke-direct {v5}, Lcom/mobfox/video/sdk/InterstitialData;-><init>()V */
/* .line 212 */
/* .local v5, "inter":Lcom/mobfox/video/sdk/InterstitialData; */
final String v11 = "autoclose"; // const-string v11, "autoclose"
/* move-object/from16 v0, p4 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getInteger(Ljava/lang/String;)I */
/* iput v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->autoclose:I */
/* .line 213 */
final String v11 = "type"; // const-string v11, "type"
/* move-object/from16 v0, p4 */
/* .line 214 */
/* .restart local v8 # "type":Ljava/lang/String; */
final String v11 = "url"; // const-string v11, "url"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_16
/* .line 215 */
int v11 = 0; // const/4 v11, 0x0
/* iput v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->interstitialType:I */
/* .line 216 */
final String v11 = "url"; // const-string v11, "url"
/* move-object/from16 v0, p4 */
/* .line 217 */
/* .local v9, "url":Ljava/lang/String; */
if ( v9 != null) { // if-eqz v9, :cond_14
v11 = (( java.lang.String ) v9 ).length ( ); // invoke-virtual {v9}, Ljava/lang/String;->length()I
/* if-nez v11, :cond_15 */
/* .line 218 */
} // :cond_14
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 219 */
/* new-instance v12, Ljava/lang/StringBuilder; */
final String v13 = "Empty url for interstitial type "; // const-string v13, "Empty url for interstitial type "
/* invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v12 ).append ( v8 ); // invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 218 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 221 */
} // :cond_15
this.interstitialUrl = v9;
/* .line 236 */
} // .end local v9 # "url":Ljava/lang/String;
} // :goto_3
final String v11 = "orientation"; // const-string v11, "orientation"
/* move-object/from16 v0, p4 */
/* .line 237 */
/* .restart local v6 # "orientation":Ljava/lang/String; */
final String v11 = "landscape"; // const-string v11, "landscape"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v6 ); // invoke-virtual {v11, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_1a
/* .line 238 */
int v11 = 0; // const/4 v11, 0x0
/* iput v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->orientation:I */
/* .line 244 */
} // :goto_4
v11 = this.richMediaAd;
if ( v11 != null) { // if-eqz v11, :cond_1d
/* .line 245 */
v11 = this.richMediaAd;
v11 = (( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getType ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getType()I
int v12 = 2; // const/4 v12, 0x2
/* if-ne v11, v12, :cond_1c */
/* .line 246 */
v11 = this.richMediaAd;
v11 = (( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getType ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getType()I
int v12 = 4; // const/4 v12, 0x4
/* if-eq v11, v12, :cond_1c */
/* .line 247 */
v11 = this.richMediaAd;
v11 = (( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getType ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getType()I
int v12 = 1; // const/4 v12, 0x1
/* if-eq v11, v12, :cond_1c */
/* .line 248 */
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 249 */
/* new-instance v12, Ljava/lang/StringBuilder; */
final String v13 = "Found Interstitial tag in a video ad:"; // const-string v13, "Found Interstitial tag in a video ad:"
/* invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 250 */
v13 = this.richMediaAd;
v13 = (( com.mobfox.video.sdk.RichMediaAdData ) v13 ).getType ( ); // invoke-virtual {v13}, Lcom/mobfox/video/sdk/RichMediaAdData;->getType()I
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 249 */
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 248 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 222 */
} // .end local v6 # "orientation":Ljava/lang/String;
} // :cond_16
final String v11 = "markup"; // const-string v11, "markup"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_17
/* .line 223 */
int v11 = 1; // const/4 v11, 0x1
/* iput v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->interstitialType:I */
/* .line 224 */
int v11 = 1; // const/4 v11, 0x1
/* iput-boolean v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideMarkup:Z */
/* .line 226 */
} // :cond_17
int v11 = 0; // const/4 v11, 0x0
/* iput v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->interstitialType:I */
/* .line 227 */
final String v11 = "url"; // const-string v11, "url"
/* move-object/from16 v0, p4 */
/* .line 228 */
/* .restart local v9 # "url":Ljava/lang/String; */
if ( v9 != null) { // if-eqz v9, :cond_18
v11 = (( java.lang.String ) v9 ).length ( ); // invoke-virtual {v9}, Ljava/lang/String;->length()I
/* if-nez v11, :cond_19 */
/* .line 229 */
} // :cond_18
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 230 */
/* new-instance v12, Ljava/lang/StringBuilder; */
final String v13 = "Empty url for interstitial type "; // const-string v13, "Empty url for interstitial type "
/* invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v12 ).append ( v8 ); // invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 229 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 232 */
} // :cond_19
this.interstitialUrl = v9;
/* goto/16 :goto_3 */
/* .line 239 */
} // .end local v9 # "url":Ljava/lang/String;
/* .restart local v6 # "orientation":Ljava/lang/String; */
} // :cond_1a
final String v11 = "portrait"; // const-string v11, "portrait"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v6 ); // invoke-virtual {v11, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_1b
/* .line 240 */
int v11 = 1; // const/4 v11, 0x1
/* iput v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->orientation:I */
/* .line 242 */
} // :cond_1b
int v11 = 0; // const/4 v11, 0x0
/* iput v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->orientation:I */
/* goto/16 :goto_4 */
/* .line 252 */
} // :cond_1c
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).setInterstitial ( v5 ); // invoke-virtual {v11, v5}, Lcom/mobfox/video/sdk/RichMediaAdData;->setInterstitial(Lcom/mobfox/video/sdk/InterstitialData;)V
/* goto/16 :goto_0 */
/* .line 254 */
} // :cond_1d
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 255 */
final String v12 = "Interstitial tag found outside document root"; // const-string v12, "Interstitial tag found outside document root"
/* .line 254 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 257 */
} // .end local v5 # "inter":Lcom/mobfox/video/sdk/InterstitialData;
} // .end local v6 # "orientation":Ljava/lang/String;
} // .end local v8 # "type":Ljava/lang/String;
} // :cond_1e
final String v11 = "creative"; // const-string v11, "creative"
/* move-object/from16 v0, p2 */
v11 = (( java.lang.String ) v0 ).equals ( v11 ); // invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_27
/* .line 258 */
v11 = this.richMediaAd;
if ( v11 != null) { // if-eqz v11, :cond_1f
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getVideo ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* if-nez v11, :cond_20 */
/* .line 259 */
} // :cond_1f
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 260 */
final String v12 = "Creative tag found outside video node"; // const-string v12, "Creative tag found outside video node"
/* .line 259 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 262 */
} // :cond_20
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getVideo ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* .line 263 */
/* .restart local v10 # "video":Lcom/mobfox/video/sdk/VideoData; */
final String v11 = "delivery"; // const-string v11, "delivery"
/* move-object/from16 v0, p4 */
/* .line 264 */
/* .local v2, "delivery":Ljava/lang/String; */
final String v11 = "progressive"; // const-string v11, "progressive"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v11, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_23
/* .line 265 */
int v11 = 0; // const/4 v11, 0x0
/* iput v11, v10, Lcom/mobfox/video/sdk/VideoData;->delivery:I */
/* .line 271 */
} // :goto_5
final String v11 = "type"; // const-string v11, "type"
/* move-object/from16 v0, p4 */
/* .line 272 */
/* .restart local v8 # "type":Ljava/lang/String; */
if ( v8 != null) { // if-eqz v8, :cond_21
v11 = (( java.lang.String ) v8 ).length ( ); // invoke-virtual {v8}, Ljava/lang/String;->length()I
/* if-nez v11, :cond_22 */
/* .line 273 */
} // :cond_21
final String v8 = "application/mp4"; // const-string v8, "application/mp4"
/* .line 275 */
} // :cond_22
final String v11 = "display"; // const-string v11, "display"
/* move-object/from16 v0, p4 */
/* .line 276 */
/* .local v3, "display":Ljava/lang/String; */
final String v11 = "fullscreen"; // const-string v11, "fullscreen"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v3 ); // invoke-virtual {v11, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_25
/* .line 277 */
int v11 = 0; // const/4 v11, 0x0
/* iput v11, v10, Lcom/mobfox/video/sdk/VideoData;->display:I */
/* .line 283 */
} // :goto_6
this.type = v8;
/* .line 284 */
final String v11 = "width"; // const-string v11, "width"
/* move-object/from16 v0, p4 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getInteger(Ljava/lang/String;)I */
/* iput v11, v10, Lcom/mobfox/video/sdk/VideoData;->width:I */
/* .line 285 */
final String v11 = "height"; // const-string v11, "height"
/* move-object/from16 v0, p4 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getInteger(Ljava/lang/String;)I */
/* iput v11, v10, Lcom/mobfox/video/sdk/VideoData;->height:I */
/* .line 286 */
final String v11 = "bitrate"; // const-string v11, "bitrate"
/* move-object/from16 v0, p4 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getInteger(Ljava/lang/String;)I */
/* iput v11, v10, Lcom/mobfox/video/sdk/VideoData;->bitrate:I */
/* goto/16 :goto_0 */
/* .line 266 */
} // .end local v3 # "display":Ljava/lang/String;
} // .end local v8 # "type":Ljava/lang/String;
} // :cond_23
final String v11 = "streaming"; // const-string v11, "streaming"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v11, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_24
/* .line 267 */
int v11 = 1; // const/4 v11, 0x1
/* iput v11, v10, Lcom/mobfox/video/sdk/VideoData;->delivery:I */
/* .line 269 */
} // :cond_24
int v11 = 1; // const/4 v11, 0x1
/* iput v11, v10, Lcom/mobfox/video/sdk/VideoData;->delivery:I */
/* .line 278 */
/* .restart local v3 # "display":Ljava/lang/String; */
/* .restart local v8 # "type":Ljava/lang/String; */
} // :cond_25
final String v11 = "normal"; // const-string v11, "normal"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v3 ); // invoke-virtual {v11, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_26
/* .line 279 */
int v11 = 1; // const/4 v11, 0x1
/* iput v11, v10, Lcom/mobfox/video/sdk/VideoData;->display:I */
/* .line 281 */
} // :cond_26
int v11 = 0; // const/4 v11, 0x0
/* iput v11, v10, Lcom/mobfox/video/sdk/VideoData;->display:I */
/* .line 287 */
} // .end local v2 # "delivery":Ljava/lang/String;
} // .end local v3 # "display":Ljava/lang/String;
} // .end local v8 # "type":Ljava/lang/String;
} // .end local v10 # "video":Lcom/mobfox/video/sdk/VideoData;
} // :cond_27
final String v11 = "skipbutton"; // const-string v11, "skipbutton"
/* move-object/from16 v0, p2 */
v11 = (( java.lang.String ) v0 ).equals ( v11 ); // invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_2d
/* .line 288 */
/* iget-boolean v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideVideo:Z */
if ( v11 != null) { // if-eqz v11, :cond_2a
/* .line 289 */
v11 = this.richMediaAd;
if ( v11 != null) { // if-eqz v11, :cond_28
/* .line 290 */
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getVideo ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* if-nez v11, :cond_29 */
/* .line 291 */
} // :cond_28
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 292 */
final String v12 = "skipbutton tag found inside wrong video node"; // const-string v12, "skipbutton tag found inside wrong video node"
/* .line 291 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 294 */
} // :cond_29
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getVideo ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* .line 296 */
/* .restart local v10 # "video":Lcom/mobfox/video/sdk/VideoData; */
final String v11 = "show"; // const-string v11, "show"
/* move-object/from16 v0, p4 */
/* .line 295 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getBoolean(Ljava/lang/String;)Z */
/* iput-boolean v11, v10, Lcom/mobfox/video/sdk/VideoData;->showSkipButton:Z */
/* .line 298 */
final String v11 = "showafter"; // const-string v11, "showafter"
/* move-object/from16 v0, p4 */
/* .line 297 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getInteger(Ljava/lang/String;)I */
/* iput v11, v10, Lcom/mobfox/video/sdk/VideoData;->showSkipButtonAfter:I */
/* .line 299 */
final String v11 = "graphics"; // const-string v11, "graphics"
/* move-object/from16 v0, p4 */
this.skipButtonImage = v11;
/* goto/16 :goto_0 */
/* .line 301 */
} // .end local v10 # "video":Lcom/mobfox/video/sdk/VideoData;
} // :cond_2a
/* iget-boolean v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideInterstitial:Z */
if ( v11 != null) { // if-eqz v11, :cond_0
/* .line 302 */
v11 = this.richMediaAd;
if ( v11 != null) { // if-eqz v11, :cond_2b
/* .line 303 */
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getInterstitial ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getInterstitial()Lcom/mobfox/video/sdk/InterstitialData;
/* if-nez v11, :cond_2c */
/* .line 304 */
} // :cond_2b
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 305 */
final String v12 = "skipbutton tag found inside wrong interstitial node"; // const-string v12, "skipbutton tag found inside wrong interstitial node"
/* .line 304 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 307 */
} // :cond_2c
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getInterstitial ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getInterstitial()Lcom/mobfox/video/sdk/InterstitialData;
/* .line 309 */
/* .restart local v5 # "inter":Lcom/mobfox/video/sdk/InterstitialData; */
final String v11 = "show"; // const-string v11, "show"
/* move-object/from16 v0, p4 */
/* .line 308 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getBoolean(Ljava/lang/String;)Z */
/* iput-boolean v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->showSkipButton:Z */
/* .line 311 */
final String v11 = "showafter"; // const-string v11, "showafter"
/* move-object/from16 v0, p4 */
/* .line 310 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getInteger(Ljava/lang/String;)I */
/* iput v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->showSkipButtonAfter:I */
/* .line 312 */
final String v11 = "graphics"; // const-string v11, "graphics"
/* move-object/from16 v0, p4 */
this.skipButtonImage = v11;
/* goto/16 :goto_0 */
/* .line 314 */
} // .end local v5 # "inter":Lcom/mobfox/video/sdk/InterstitialData;
} // :cond_2d
final String v11 = "navigation"; // const-string v11, "navigation"
/* move-object/from16 v0, p2 */
v11 = (( java.lang.String ) v0 ).equals ( v11 ); // invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_33
/* .line 315 */
/* iget-boolean v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideVideo:Z */
if ( v11 != null) { // if-eqz v11, :cond_30
/* .line 316 */
v11 = this.richMediaAd;
if ( v11 != null) { // if-eqz v11, :cond_2e
/* .line 317 */
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getVideo ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* if-nez v11, :cond_2f */
/* .line 318 */
} // :cond_2e
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 319 */
final String v12 = "navigation tag found inside wrong video node"; // const-string v12, "navigation tag found inside wrong video node"
/* .line 318 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 321 */
} // :cond_2f
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getVideo ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* .line 323 */
/* .restart local v10 # "video":Lcom/mobfox/video/sdk/VideoData; */
final String v11 = "show"; // const-string v11, "show"
/* move-object/from16 v0, p4 */
/* .line 322 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getBoolean(Ljava/lang/String;)Z */
/* iput-boolean v11, v10, Lcom/mobfox/video/sdk/VideoData;->showNavigationBars:Z */
/* .line 325 */
final String v11 = "allowtap"; // const-string v11, "allowtap"
/* move-object/from16 v0, p4 */
/* .line 324 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getBoolean(Ljava/lang/String;)Z */
/* iput-boolean v11, v10, Lcom/mobfox/video/sdk/VideoData;->allowTapNavigationBars:Z */
/* goto/16 :goto_0 */
/* .line 327 */
} // .end local v10 # "video":Lcom/mobfox/video/sdk/VideoData;
} // :cond_30
/* iget-boolean v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideInterstitial:Z */
if ( v11 != null) { // if-eqz v11, :cond_0
/* .line 328 */
v11 = this.richMediaAd;
if ( v11 != null) { // if-eqz v11, :cond_31
/* .line 329 */
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getInterstitial ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getInterstitial()Lcom/mobfox/video/sdk/InterstitialData;
/* if-nez v11, :cond_32 */
/* .line 330 */
} // :cond_31
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 331 */
final String v12 = "navigation tag found inside wrong interstitial node"; // const-string v12, "navigation tag found inside wrong interstitial node"
/* .line 330 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 333 */
} // :cond_32
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getInterstitial ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getInterstitial()Lcom/mobfox/video/sdk/InterstitialData;
/* .line 335 */
/* .restart local v5 # "inter":Lcom/mobfox/video/sdk/InterstitialData; */
final String v11 = "show"; // const-string v11, "show"
/* move-object/from16 v0, p4 */
/* .line 334 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getBoolean(Ljava/lang/String;)Z */
/* iput-boolean v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->showNavigationBars:Z */
/* .line 337 */
final String v11 = "allowtap"; // const-string v11, "allowtap"
/* move-object/from16 v0, p4 */
/* .line 336 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getBoolean(Ljava/lang/String;)Z */
/* iput-boolean v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->allowTapNavigationBars:Z */
/* goto/16 :goto_0 */
/* .line 339 */
} // .end local v5 # "inter":Lcom/mobfox/video/sdk/InterstitialData;
} // :cond_33
final String v11 = "topbar"; // const-string v11, "topbar"
/* move-object/from16 v0, p2 */
v11 = (( java.lang.String ) v0 ).equals ( v11 ); // invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_3b
/* .line 340 */
/* iget-boolean v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideVideo:Z */
if ( v11 != null) { // if-eqz v11, :cond_36
/* .line 341 */
v11 = this.richMediaAd;
if ( v11 != null) { // if-eqz v11, :cond_34
/* .line 342 */
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getVideo ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* if-nez v11, :cond_35 */
/* .line 343 */
} // :cond_34
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 344 */
final String v12 = "topbar tag found inside wrong video node"; // const-string v12, "topbar tag found inside wrong video node"
/* .line 343 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 346 */
} // :cond_35
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getVideo ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* .line 348 */
/* .restart local v10 # "video":Lcom/mobfox/video/sdk/VideoData; */
final String v11 = "show"; // const-string v11, "show"
/* move-object/from16 v0, p4 */
/* .line 347 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getBoolean(Ljava/lang/String;)Z */
/* iput-boolean v11, v10, Lcom/mobfox/video/sdk/VideoData;->showTopNavigationBar:Z */
/* .line 350 */
final String v11 = "custombackgroundurl"; // const-string v11, "custombackgroundurl"
/* move-object/from16 v0, p4 */
/* .line 349 */
this.topNavigationBarBackground = v11;
/* goto/16 :goto_0 */
/* .line 351 */
} // .end local v10 # "video":Lcom/mobfox/video/sdk/VideoData;
} // :cond_36
/* iget-boolean v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideInterstitial:Z */
if ( v11 != null) { // if-eqz v11, :cond_0
/* .line 352 */
v11 = this.richMediaAd;
if ( v11 != null) { // if-eqz v11, :cond_37
/* .line 353 */
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getInterstitial ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getInterstitial()Lcom/mobfox/video/sdk/InterstitialData;
/* if-nez v11, :cond_38 */
/* .line 354 */
} // :cond_37
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 355 */
final String v12 = "topbar tag found inside wrong interstitial node"; // const-string v12, "topbar tag found inside wrong interstitial node"
/* .line 354 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 357 */
} // :cond_38
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getInterstitial ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getInterstitial()Lcom/mobfox/video/sdk/InterstitialData;
/* .line 359 */
/* .restart local v5 # "inter":Lcom/mobfox/video/sdk/InterstitialData; */
final String v11 = "show"; // const-string v11, "show"
/* move-object/from16 v0, p4 */
/* .line 358 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getBoolean(Ljava/lang/String;)Z */
/* iput-boolean v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->showTopNavigationBar:Z */
/* .line 361 */
final String v11 = "custombackgroundurl"; // const-string v11, "custombackgroundurl"
/* move-object/from16 v0, p4 */
/* .line 360 */
this.topNavigationBarBackground = v11;
/* .line 362 */
final String v11 = "title"; // const-string v11, "title"
/* move-object/from16 v0, p4 */
/* .line 363 */
/* .local v7, "titleType":Ljava/lang/String; */
final String v11 = "fixed"; // const-string v11, "fixed"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v7 ); // invoke-virtual {v11, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_39
/* .line 364 */
int v11 = 0; // const/4 v11, 0x0
/* iput v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->topNavigationBarTitleType:I */
/* .line 366 */
final String v11 = "titlecontent"; // const-string v11, "titlecontent"
/* move-object/from16 v0, p4 */
/* .line 365 */
this.topNavigationBarTitle = v11;
/* goto/16 :goto_0 */
/* .line 367 */
} // :cond_39
final String v11 = "variable"; // const-string v11, "variable"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v7 ); // invoke-virtual {v11, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_3a
/* .line 368 */
int v11 = 1; // const/4 v11, 0x1
/* iput v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->topNavigationBarTitleType:I */
/* goto/16 :goto_0 */
/* .line 371 */
} // :cond_3a
int v11 = 2; // const/4 v11, 0x2
/* iput v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->topNavigationBarTitleType:I */
/* goto/16 :goto_0 */
/* .line 374 */
} // .end local v5 # "inter":Lcom/mobfox/video/sdk/InterstitialData;
} // .end local v7 # "titleType":Ljava/lang/String;
} // :cond_3b
final String v11 = "bottombar"; // const-string v11, "bottombar"
/* move-object/from16 v0, p2 */
v11 = (( java.lang.String ) v0 ).equals ( v11 ); // invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_41
/* .line 375 */
/* iget-boolean v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideVideo:Z */
if ( v11 != null) { // if-eqz v11, :cond_3e
/* .line 376 */
v11 = this.richMediaAd;
if ( v11 != null) { // if-eqz v11, :cond_3c
/* .line 377 */
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getVideo ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* if-nez v11, :cond_3d */
/* .line 378 */
} // :cond_3c
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 379 */
final String v12 = "bottombar tag found inside wrong video node"; // const-string v12, "bottombar tag found inside wrong video node"
/* .line 378 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 381 */
} // :cond_3d
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getVideo ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* .line 383 */
/* .restart local v10 # "video":Lcom/mobfox/video/sdk/VideoData; */
final String v11 = "show"; // const-string v11, "show"
/* move-object/from16 v0, p4 */
/* .line 382 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getBoolean(Ljava/lang/String;)Z */
/* iput-boolean v11, v10, Lcom/mobfox/video/sdk/VideoData;->showBottomNavigationBar:Z */
/* .line 385 */
final String v11 = "custombackgroundurl"; // const-string v11, "custombackgroundurl"
/* move-object/from16 v0, p4 */
/* .line 384 */
this.bottomNavigationBarBackground = v11;
/* .line 387 */
final String v11 = "pausebutton"; // const-string v11, "pausebutton"
/* move-object/from16 v0, p4 */
/* .line 386 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getBoolean(Ljava/lang/String;)Z */
/* iput-boolean v11, v10, Lcom/mobfox/video/sdk/VideoData;->showPauseButton:Z */
/* .line 389 */
final String v11 = "replaybutton"; // const-string v11, "replaybutton"
/* move-object/from16 v0, p4 */
/* .line 388 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getBoolean(Ljava/lang/String;)Z */
/* iput-boolean v11, v10, Lcom/mobfox/video/sdk/VideoData;->showReplayButton:Z */
/* .line 390 */
final String v11 = "timer"; // const-string v11, "timer"
/* move-object/from16 v0, p4 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getBoolean(Ljava/lang/String;)Z */
/* iput-boolean v11, v10, Lcom/mobfox/video/sdk/VideoData;->showTimer:Z */
/* .line 392 */
final String v11 = "pausebuttonurl"; // const-string v11, "pausebuttonurl"
/* move-object/from16 v0, p4 */
/* .line 391 */
this.pauseButtonImage = v11;
/* .line 394 */
final String v11 = "playbuttonurl"; // const-string v11, "playbuttonurl"
/* move-object/from16 v0, p4 */
/* .line 393 */
this.playButtonImage = v11;
/* .line 396 */
final String v11 = "replaybuttonurl"; // const-string v11, "replaybuttonurl"
/* move-object/from16 v0, p4 */
/* .line 395 */
this.replayButtonImage = v11;
/* goto/16 :goto_0 */
/* .line 397 */
} // .end local v10 # "video":Lcom/mobfox/video/sdk/VideoData;
} // :cond_3e
/* iget-boolean v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideInterstitial:Z */
if ( v11 != null) { // if-eqz v11, :cond_0
/* .line 398 */
v11 = this.richMediaAd;
if ( v11 != null) { // if-eqz v11, :cond_3f
/* .line 399 */
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getInterstitial ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getInterstitial()Lcom/mobfox/video/sdk/InterstitialData;
/* if-nez v11, :cond_40 */
/* .line 400 */
} // :cond_3f
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 401 */
final String v12 = "bottombar tag found inside wrong interstitial node"; // const-string v12, "bottombar tag found inside wrong interstitial node"
/* .line 400 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 403 */
} // :cond_40
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getInterstitial ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getInterstitial()Lcom/mobfox/video/sdk/InterstitialData;
/* .line 405 */
/* .restart local v5 # "inter":Lcom/mobfox/video/sdk/InterstitialData; */
final String v11 = "show"; // const-string v11, "show"
/* move-object/from16 v0, p4 */
/* .line 404 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getBoolean(Ljava/lang/String;)Z */
/* iput-boolean v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->showBottomNavigationBar:Z */
/* .line 407 */
final String v11 = "custombackgroundurl"; // const-string v11, "custombackgroundurl"
/* move-object/from16 v0, p4 */
/* .line 406 */
this.bottomNavigationBarBackground = v11;
/* .line 409 */
final String v11 = "backbutton"; // const-string v11, "backbutton"
/* move-object/from16 v0, p4 */
/* .line 408 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getBoolean(Ljava/lang/String;)Z */
/* iput-boolean v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->showBackButton:Z */
/* .line 411 */
final String v11 = "forwardbutton"; // const-string v11, "forwardbutton"
/* move-object/from16 v0, p4 */
/* .line 410 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getBoolean(Ljava/lang/String;)Z */
/* iput-boolean v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->showForwardButton:Z */
/* .line 413 */
final String v11 = "reloadbutton"; // const-string v11, "reloadbutton"
/* move-object/from16 v0, p4 */
/* .line 412 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getBoolean(Ljava/lang/String;)Z */
/* iput-boolean v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->showReloadButton:Z */
/* .line 415 */
final String v11 = "externalbutton"; // const-string v11, "externalbutton"
/* move-object/from16 v0, p4 */
/* .line 414 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getBoolean(Ljava/lang/String;)Z */
/* iput-boolean v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->showExternalButton:Z */
/* .line 416 */
final String v11 = "timer"; // const-string v11, "timer"
/* move-object/from16 v0, p4 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getBoolean(Ljava/lang/String;)Z */
/* iput-boolean v11, v5, Lcom/mobfox/video/sdk/InterstitialData;->showTimer:Z */
/* .line 418 */
final String v11 = "backbuttonurl"; // const-string v11, "backbuttonurl"
/* move-object/from16 v0, p4 */
/* .line 417 */
this.backButtonImage = v11;
/* .line 420 */
final String v11 = "forwardbuttonurl"; // const-string v11, "forwardbuttonurl"
/* move-object/from16 v0, p4 */
/* .line 419 */
this.forwardButtonImage = v11;
/* .line 422 */
final String v11 = "reloadbuttonurl"; // const-string v11, "reloadbuttonurl"
/* move-object/from16 v0, p4 */
/* .line 421 */
this.reloadButtonImage = v11;
/* .line 424 */
final String v11 = "externalbuttonurl"; // const-string v11, "externalbuttonurl"
/* move-object/from16 v0, p4 */
/* .line 423 */
this.externalButtonImage = v11;
/* goto/16 :goto_0 */
/* .line 426 */
} // .end local v5 # "inter":Lcom/mobfox/video/sdk/InterstitialData;
} // :cond_41
final String v11 = "navicon"; // const-string v11, "navicon"
/* move-object/from16 v0, p2 */
v11 = (( java.lang.String ) v0 ).equals ( v11 ); // invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_49
/* .line 427 */
/* iget-boolean v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideVideo:Z */
if ( v11 != null) { // if-eqz v11, :cond_45
/* .line 428 */
v11 = this.richMediaAd;
if ( v11 != null) { // if-eqz v11, :cond_42
/* .line 429 */
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getVideo ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* if-nez v11, :cond_43 */
/* .line 430 */
} // :cond_42
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 431 */
final String v12 = "navicon tag found inside wrong video node"; // const-string v12, "navicon tag found inside wrong video node"
/* .line 430 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 433 */
} // :cond_43
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getVideo ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* .line 434 */
/* .restart local v10 # "video":Lcom/mobfox/video/sdk/VideoData; */
/* new-instance v4, Lcom/mobfox/video/sdk/NavIconData; */
/* invoke-direct {v4}, Lcom/mobfox/video/sdk/NavIconData;-><init>()V */
/* .line 435 */
/* .local v4, "icon":Lcom/mobfox/video/sdk/NavIconData; */
final String v11 = "title"; // const-string v11, "title"
/* move-object/from16 v0, p4 */
this.title = v11;
/* .line 436 */
final String v11 = "clickurl"; // const-string v11, "clickurl"
/* move-object/from16 v0, p4 */
this.clickUrl = v11;
/* .line 437 */
final String v11 = "iconurl"; // const-string v11, "iconurl"
/* move-object/from16 v0, p4 */
this.iconUrl = v11;
/* .line 438 */
final String v11 = "opentype"; // const-string v11, "opentype"
/* move-object/from16 v0, p4 */
/* .line 439 */
/* .restart local v8 # "type":Ljava/lang/String; */
final String v11 = "inapp"; // const-string v11, "inapp"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_44
/* .line 440 */
int v11 = 0; // const/4 v11, 0x0
/* iput v11, v4, Lcom/mobfox/video/sdk/NavIconData;->openType:I */
/* .line 444 */
} // :goto_7
v11 = this.icons;
(( java.util.Vector ) v11 ).add ( v4 ); // invoke-virtual {v11, v4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
/* goto/16 :goto_0 */
/* .line 442 */
} // :cond_44
int v11 = 1; // const/4 v11, 0x1
/* iput v11, v4, Lcom/mobfox/video/sdk/NavIconData;->openType:I */
/* .line 445 */
} // .end local v4 # "icon":Lcom/mobfox/video/sdk/NavIconData;
} // .end local v8 # "type":Ljava/lang/String;
} // .end local v10 # "video":Lcom/mobfox/video/sdk/VideoData;
} // :cond_45
/* iget-boolean v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideInterstitial:Z */
if ( v11 != null) { // if-eqz v11, :cond_0
/* .line 446 */
v11 = this.richMediaAd;
if ( v11 != null) { // if-eqz v11, :cond_46
/* .line 447 */
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getInterstitial ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getInterstitial()Lcom/mobfox/video/sdk/InterstitialData;
/* if-nez v11, :cond_47 */
/* .line 448 */
} // :cond_46
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 449 */
final String v12 = "navicon tag found inside wrong interstitial node"; // const-string v12, "navicon tag found inside wrong interstitial node"
/* .line 448 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 451 */
} // :cond_47
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getInterstitial ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getInterstitial()Lcom/mobfox/video/sdk/InterstitialData;
/* .line 452 */
/* .restart local v5 # "inter":Lcom/mobfox/video/sdk/InterstitialData; */
/* new-instance v4, Lcom/mobfox/video/sdk/NavIconData; */
/* invoke-direct {v4}, Lcom/mobfox/video/sdk/NavIconData;-><init>()V */
/* .line 453 */
/* .restart local v4 # "icon":Lcom/mobfox/video/sdk/NavIconData; */
final String v11 = "title"; // const-string v11, "title"
/* move-object/from16 v0, p4 */
this.title = v11;
/* .line 454 */
final String v11 = "clickurl"; // const-string v11, "clickurl"
/* move-object/from16 v0, p4 */
this.clickUrl = v11;
/* .line 455 */
final String v11 = "iconurl"; // const-string v11, "iconurl"
/* move-object/from16 v0, p4 */
this.iconUrl = v11;
/* .line 456 */
final String v11 = "opentype"; // const-string v11, "opentype"
/* move-object/from16 v0, p4 */
/* .line 457 */
/* .restart local v8 # "type":Ljava/lang/String; */
final String v11 = "inapp"; // const-string v11, "inapp"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_48
/* .line 458 */
int v11 = 0; // const/4 v11, 0x0
/* iput v11, v4, Lcom/mobfox/video/sdk/NavIconData;->openType:I */
/* .line 462 */
} // :goto_8
v11 = this.icons;
(( java.util.Vector ) v11 ).add ( v4 ); // invoke-virtual {v11, v4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
/* goto/16 :goto_0 */
/* .line 460 */
} // :cond_48
int v11 = 1; // const/4 v11, 0x1
/* iput v11, v4, Lcom/mobfox/video/sdk/NavIconData;->openType:I */
/* .line 464 */
} // .end local v4 # "icon":Lcom/mobfox/video/sdk/NavIconData;
} // .end local v5 # "inter":Lcom/mobfox/video/sdk/InterstitialData;
} // .end local v8 # "type":Ljava/lang/String;
} // :cond_49
final String v11 = "tracker"; // const-string v11, "tracker"
/* move-object/from16 v0, p2 */
v11 = (( java.lang.String ) v0 ).equals ( v11 ); // invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_57
/* .line 465 */
/* iget-boolean v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideVideo:Z */
if ( v11 != null) { // if-eqz v11, :cond_0
/* .line 466 */
v11 = this.richMediaAd;
if ( v11 != null) { // if-eqz v11, :cond_4a
/* .line 467 */
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getVideo ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* if-nez v11, :cond_4b */
/* .line 468 */
} // :cond_4a
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 469 */
final String v12 = "tracker tag found inside wrong video node"; // const-string v12, "tracker tag found inside wrong video node"
/* .line 468 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 471 */
} // :cond_4b
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getVideo ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* .line 472 */
/* .restart local v10 # "video":Lcom/mobfox/video/sdk/VideoData; */
v11 = this.currentTracker;
(( com.mobfox.video.sdk.TrackerData ) v11 ).reset ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/TrackerData;->reset()V
/* .line 473 */
final String v11 = "type"; // const-string v11, "type"
/* move-object/from16 v0, p4 */
/* .line 474 */
/* .restart local v8 # "type":Ljava/lang/String; */
final String v11 = "start"; // const-string v11, "start"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_4c
/* .line 475 */
v11 = this.currentTracker;
int v12 = 0; // const/4 v12, 0x0
/* iput v12, v11, Lcom/mobfox/video/sdk/TrackerData;->type:I */
/* goto/16 :goto_0 */
/* .line 476 */
} // :cond_4c
final String v11 = "complete"; // const-string v11, "complete"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_4d
/* .line 477 */
v11 = this.currentTracker;
int v12 = 1; // const/4 v12, 0x1
/* iput v12, v11, Lcom/mobfox/video/sdk/TrackerData;->type:I */
/* goto/16 :goto_0 */
/* .line 478 */
} // :cond_4d
final String v11 = "midpoint"; // const-string v11, "midpoint"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_4e
/* .line 479 */
v11 = this.currentTracker;
int v12 = 2; // const/4 v12, 0x2
/* iput v12, v11, Lcom/mobfox/video/sdk/TrackerData;->type:I */
/* .line 480 */
v11 = this.currentTracker;
/* iget v12, v10, Lcom/mobfox/video/sdk/VideoData;->duration:I */
/* div-int/lit8 v12, v12, 0x2 */
/* iput v12, v11, Lcom/mobfox/video/sdk/TrackerData;->time:I */
/* goto/16 :goto_0 */
/* .line 481 */
} // :cond_4e
final String v11 = "firstquartile"; // const-string v11, "firstquartile"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_4f
/* .line 482 */
v11 = this.currentTracker;
int v12 = 3; // const/4 v12, 0x3
/* iput v12, v11, Lcom/mobfox/video/sdk/TrackerData;->type:I */
/* .line 483 */
v11 = this.currentTracker;
/* iget v12, v10, Lcom/mobfox/video/sdk/VideoData;->duration:I */
/* div-int/lit8 v12, v12, 0x4 */
/* iput v12, v11, Lcom/mobfox/video/sdk/TrackerData;->time:I */
/* goto/16 :goto_0 */
/* .line 484 */
} // :cond_4f
final String v11 = "thirdquartile"; // const-string v11, "thirdquartile"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_50
/* .line 485 */
v11 = this.currentTracker;
int v12 = 4; // const/4 v12, 0x4
/* iput v12, v11, Lcom/mobfox/video/sdk/TrackerData;->type:I */
/* .line 486 */
v11 = this.currentTracker;
/* iget v12, v10, Lcom/mobfox/video/sdk/VideoData;->duration:I */
/* mul-int/lit8 v12, v12, 0x3 */
/* div-int/lit8 v12, v12, 0x4 */
/* iput v12, v11, Lcom/mobfox/video/sdk/TrackerData;->time:I */
/* goto/16 :goto_0 */
/* .line 487 */
} // :cond_50
final String v11 = "pause"; // const-string v11, "pause"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_51
/* .line 488 */
v11 = this.currentTracker;
int v12 = 6; // const/4 v12, 0x6
/* iput v12, v11, Lcom/mobfox/video/sdk/TrackerData;->type:I */
/* goto/16 :goto_0 */
/* .line 489 */
} // :cond_51
final String v11 = "unpause"; // const-string v11, "unpause"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_52
/* .line 490 */
v11 = this.currentTracker;
int v12 = 7; // const/4 v12, 0x7
/* iput v12, v11, Lcom/mobfox/video/sdk/TrackerData;->type:I */
/* goto/16 :goto_0 */
/* .line 491 */
} // :cond_52
final String v11 = "mute"; // const-string v11, "mute"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_53
/* .line 492 */
v11 = this.currentTracker;
/* const/16 v12, 0x8 */
/* iput v12, v11, Lcom/mobfox/video/sdk/TrackerData;->type:I */
/* goto/16 :goto_0 */
/* .line 493 */
} // :cond_53
final String v11 = "unmute"; // const-string v11, "unmute"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_54
/* .line 494 */
v11 = this.currentTracker;
/* const/16 v12, 0x9 */
/* iput v12, v11, Lcom/mobfox/video/sdk/TrackerData;->type:I */
/* goto/16 :goto_0 */
/* .line 495 */
} // :cond_54
final String v11 = "replay"; // const-string v11, "replay"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_55
/* .line 496 */
v11 = this.currentTracker;
/* const/16 v12, 0xb */
/* iput v12, v11, Lcom/mobfox/video/sdk/TrackerData;->type:I */
/* goto/16 :goto_0 */
/* .line 497 */
} // :cond_55
final String v11 = "skip"; // const-string v11, "skip"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_56
/* .line 498 */
v11 = this.currentTracker;
/* const/16 v12, 0xa */
/* iput v12, v11, Lcom/mobfox/video/sdk/TrackerData;->type:I */
/* goto/16 :goto_0 */
/* .line 499 */
} // :cond_56
if ( v8 != null) { // if-eqz v8, :cond_0
final String v11 = "sec:"; // const-string v11, "sec:"
v11 = (( java.lang.String ) v8 ).startsWith ( v11 ); // invoke-virtual {v8, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_0
/* .line 500 */
v11 = this.currentTracker;
int v12 = 5; // const/4 v12, 0x5
/* iput v12, v11, Lcom/mobfox/video/sdk/TrackerData;->type:I */
/* .line 501 */
v11 = this.currentTracker;
int v12 = 4; // const/4 v12, 0x4
(( java.lang.String ) v8 ).substring ( v12 ); // invoke-virtual {v8, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;
v12 = /* invoke-direct {p0, v12}, Lcom/mobfox/video/sdk/ResponseHandler;->getInteger(Ljava/lang/String;)I */
/* iput v12, v11, Lcom/mobfox/video/sdk/TrackerData;->time:I */
/* goto/16 :goto_0 */
/* .line 504 */
} // .end local v8 # "type":Ljava/lang/String;
} // .end local v10 # "video":Lcom/mobfox/video/sdk/VideoData;
} // :cond_57
final String v11 = "htmloverlay"; // const-string v11, "htmloverlay"
/* move-object/from16 v0, p2 */
v11 = (( java.lang.String ) v0 ).equals ( v11 ); // invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v11 != null) { // if-eqz v11, :cond_0
/* .line 505 */
/* iget-boolean v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideVideo:Z */
if ( v11 != null) { // if-eqz v11, :cond_0
/* .line 506 */
v11 = this.richMediaAd;
if ( v11 != null) { // if-eqz v11, :cond_58
/* .line 507 */
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getVideo ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* if-nez v11, :cond_59 */
/* .line 508 */
} // :cond_58
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 509 */
final String v12 = "htmloverlay tag found inside wrong video node"; // const-string v12, "htmloverlay tag found inside wrong video node"
/* .line 508 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 511 */
} // :cond_59
v11 = this.richMediaAd;
(( com.mobfox.video.sdk.RichMediaAdData ) v11 ).getVideo ( ); // invoke-virtual {v11}, Lcom/mobfox/video/sdk/RichMediaAdData;->getVideo()Lcom/mobfox/video/sdk/VideoData;
/* .line 512 */
/* .restart local v10 # "video":Lcom/mobfox/video/sdk/VideoData; */
int v11 = 1; // const/4 v11, 0x1
/* iput-boolean v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideMarkup:Z */
/* .line 513 */
final String v11 = "type"; // const-string v11, "type"
/* move-object/from16 v0, p4 */
/* .line 514 */
/* .restart local v8 # "type":Ljava/lang/String; */
final String v11 = "url"; // const-string v11, "url"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_5c
/* .line 515 */
int v11 = 0; // const/4 v11, 0x0
/* iput v11, v10, Lcom/mobfox/video/sdk/VideoData;->htmlOverlayType:I */
/* .line 516 */
final String v11 = "url"; // const-string v11, "url"
/* move-object/from16 v0, p4 */
/* .line 517 */
/* .restart local v9 # "url":Ljava/lang/String; */
if ( v9 != null) { // if-eqz v9, :cond_5a
v11 = (( java.lang.String ) v9 ).length ( ); // invoke-virtual {v9}, Ljava/lang/String;->length()I
/* if-nez v11, :cond_5b */
/* .line 518 */
} // :cond_5a
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 519 */
/* new-instance v12, Ljava/lang/StringBuilder; */
final String v13 = "Empty url for overlay type "; // const-string v13, "Empty url for overlay type "
/* invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v12 ).append ( v8 ); // invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 518 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 521 */
} // :cond_5b
this.htmlOverlayUrl = v9;
/* .line 537 */
} // .end local v9 # "url":Ljava/lang/String;
} // :goto_9
final String v11 = "showafter"; // const-string v11, "showafter"
/* move-object/from16 v0, p4 */
/* .line 536 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getInteger(Ljava/lang/String;)I */
/* iput v11, v10, Lcom/mobfox/video/sdk/VideoData;->showHtmlOverlayAfter:I */
/* .line 539 */
final String v11 = "show"; // const-string v11, "show"
/* move-object/from16 v0, p4 */
/* .line 538 */
v11 = /* invoke-direct {p0, v11}, Lcom/mobfox/video/sdk/ResponseHandler;->getBoolean(Ljava/lang/String;)Z */
/* iput-boolean v11, v10, Lcom/mobfox/video/sdk/VideoData;->showHtmlOverlay:Z */
/* goto/16 :goto_0 */
/* .line 522 */
} // :cond_5c
final String v11 = "markup"; // const-string v11, "markup"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_5d
/* .line 523 */
int v11 = 1; // const/4 v11, 0x1
/* iput v11, v10, Lcom/mobfox/video/sdk/VideoData;->htmlOverlayType:I */
/* .line 524 */
int v11 = 1; // const/4 v11, 0x1
/* iput-boolean v11, p0, Lcom/mobfox/video/sdk/ResponseHandler;->insideMarkup:Z */
/* .line 526 */
} // :cond_5d
int v11 = 0; // const/4 v11, 0x0
/* iput v11, v10, Lcom/mobfox/video/sdk/VideoData;->htmlOverlayType:I */
/* .line 527 */
final String v11 = "url"; // const-string v11, "url"
/* move-object/from16 v0, p4 */
/* .line 528 */
/* .restart local v9 # "url":Ljava/lang/String; */
if ( v9 != null) { // if-eqz v9, :cond_5e
v11 = (( java.lang.String ) v9 ).length ( ); // invoke-virtual {v9}, Ljava/lang/String;->length()I
/* if-nez v11, :cond_5f */
/* .line 529 */
} // :cond_5e
/* new-instance v11, Lorg/xml/sax/SAXException; */
/* .line 530 */
/* new-instance v12, Ljava/lang/StringBuilder; */
final String v13 = "Empty url for overlay type "; // const-string v13, "Empty url for overlay type "
/* invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v12 ).append ( v8 ); // invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 529 */
/* invoke-direct {v11, v12}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* .line 532 */
} // :cond_5f
this.htmlOverlayUrl = v9;
} // .end method
