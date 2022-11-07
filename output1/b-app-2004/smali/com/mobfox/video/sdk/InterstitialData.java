public class com.mobfox.video.sdk.InterstitialData implements java.io.Serializable {
	 /* .source "InterstitialData.java" */
	 /* # interfaces */
	 /* # static fields */
	 public static final Integer INTERSTITIAL_MARKUP;
	 public static final Integer INTERSTITIAL_TITLE_FIXED;
	 public static final Integer INTERSTITIAL_TITLE_HIDDEN;
	 public static final Integer INTERSTITIAL_TITLE_HTML;
	 public static final Integer INTERSTITIAL_URL;
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 Boolean allowTapNavigationBars;
	 Integer autoclose;
	 java.lang.String backButtonImage;
	 java.lang.String bottomNavigationBarBackground;
	 java.lang.String externalButtonImage;
	 java.lang.String forwardButtonImage;
	 java.util.Vector icons;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Vector", */
	 /* "<", */
	 /* "Lcom/mobfox/video/sdk/NavIconData;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
java.lang.String interstitialMarkup;
Integer interstitialType;
java.lang.String interstitialUrl;
Integer orientation;
java.lang.String reloadButtonImage;
Boolean showBackButton;
Boolean showBottomNavigationBar;
Boolean showExternalButton;
Boolean showForwardButton;
Boolean showNavigationBars;
Boolean showReloadButton;
Boolean showSkipButton;
Integer showSkipButtonAfter;
Boolean showTimer;
Boolean showTopNavigationBar;
java.lang.String skipButtonImage;
java.lang.String topNavigationBarBackground;
java.lang.String topNavigationBarTitle;
Integer topNavigationBarTitleType;
/* # direct methods */
public com.mobfox.video.sdk.InterstitialData ( ) {
/* .locals 1 */
/* .prologue */
/* .line 11 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 101 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
this.icons = v0;
/* .line 11 */
return;
} // .end method
/* # virtual methods */
public java.lang.String toString ( ) {
/* .locals 2 */
/* .prologue */
/* .line 105 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "InterstitialData \n[\nautoclose="; // const-string v1, "InterstitialData \n[\nautoclose="
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v1, p0, Lcom/mobfox/video/sdk/InterstitialData;->autoclose:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 106 */
final String v1 = ",\norientation="; // const-string v1, ",\norientation="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/mobfox/video/sdk/InterstitialData;->orientation:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ",\ninterstitialType="; // const-string v1, ",\ninterstitialType="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 107 */
/* iget v1, p0, Lcom/mobfox/video/sdk/InterstitialData;->interstitialType:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ",\ninterstitialUrl="; // const-string v1, ",\ninterstitialUrl="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.interstitialUrl;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 108 */
final String v1 = ",\ninterstitialMarkup="; // const-string v1, ",\ninterstitialMarkup="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.interstitialMarkup;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 109 */
final String v1 = ",\nshowSkipButton="; // const-string v1, ",\nshowSkipButton="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/InterstitialData;->showSkipButton:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
/* .line 110 */
final String v1 = ",\nshowSkipButtonAfter="; // const-string v1, ",\nshowSkipButtonAfter="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/mobfox/video/sdk/InterstitialData;->showSkipButtonAfter:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 111 */
final String v1 = ",\nskipButtonImage="; // const-string v1, ",\nskipButtonImage="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.skipButtonImage;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 112 */
final String v1 = ",\nshowNavigationBars="; // const-string v1, ",\nshowNavigationBars="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/InterstitialData;->showNavigationBars:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
/* .line 113 */
final String v1 = ",\nallowTapNavigationBars="; // const-string v1, ",\nallowTapNavigationBars="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/InterstitialData;->allowTapNavigationBars:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
/* .line 114 */
final String v1 = ",\nshowTopNavigationBar="; // const-string v1, ",\nshowTopNavigationBar="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/InterstitialData;->showTopNavigationBar:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
/* .line 115 */
final String v1 = ",\ntopNavigationBarBackground="; // const-string v1, ",\ntopNavigationBarBackground="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.topNavigationBarBackground;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 116 */
final String v1 = ",\ntopNavigationBarTitleType="; // const-string v1, ",\ntopNavigationBarTitleType="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/mobfox/video/sdk/InterstitialData;->topNavigationBarTitleType:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 117 */
final String v1 = ",\ntopNavigationBarTitle="; // const-string v1, ",\ntopNavigationBarTitle="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.topNavigationBarTitle;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 118 */
final String v1 = ",\nshowBottomNavigationBar="; // const-string v1, ",\nshowBottomNavigationBar="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/InterstitialData;->showBottomNavigationBar:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
/* .line 119 */
final String v1 = ",\nbottomNavigationBarBackground="; // const-string v1, ",\nbottomNavigationBarBackground="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 120 */
v1 = this.bottomNavigationBarBackground;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ",\nshowBackButton="; // const-string v1, ",\nshowBackButton="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 121 */
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/InterstitialData;->showBackButton:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v1 = ",\nbackButtonImage="; // const-string v1, ",\nbackButtonImage="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.backButtonImage;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 122 */
final String v1 = ",\nshowForwardButton="; // const-string v1, ",\nshowForwardButton="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/InterstitialData;->showForwardButton:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
/* .line 123 */
final String v1 = ",\nforwardButtonImage="; // const-string v1, ",\nforwardButtonImage="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.forwardButtonImage;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 124 */
final String v1 = ",\nshowReloadButton="; // const-string v1, ",\nshowReloadButton="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/InterstitialData;->showReloadButton:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
/* .line 125 */
final String v1 = ",\nreloadButtonImage="; // const-string v1, ",\nreloadButtonImage="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.reloadButtonImage;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 126 */
final String v1 = ",\nshowExternalButton="; // const-string v1, ",\nshowExternalButton="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/InterstitialData;->showExternalButton:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
/* .line 127 */
final String v1 = ",\nexternalButtonImage="; // const-string v1, ",\nexternalButtonImage="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.externalButtonImage;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 128 */
final String v1 = ",\nshowTimer="; // const-string v1, ",\nshowTimer="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/InterstitialData;->showTimer:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
final String v1 = ",\nicons="; // const-string v1, ",\nicons="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.icons;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "\n]"; // const-string v1, "\n]"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 105 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
