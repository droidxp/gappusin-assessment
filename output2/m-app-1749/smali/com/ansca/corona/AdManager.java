public class com.ansca.corona.AdManager {
	 /* .source "AdManager.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/ansca/corona/AdManager$CoronaInneractiveFullscreenAdListener;, */
	 /* Lcom/ansca/corona/AdManager$CoronaInneractiveAdListener;, */
	 /* Lcom/ansca/corona/AdManager$CoronaInMobiAdDelegate; */
	 /* } */
} // .end annotation
/* # instance fields */
private java.lang.String fInMobiApplicationId;
private java.util.Timer fInMobiTimer;
private android.view.ViewGroup fInneractiveAdViewGroup;
private java.lang.String fInneractiveApplicationId;
private android.app.Activity fParentActivity;
/* # direct methods */
public com.ansca.corona.AdManager ( ) {
	 /* .locals 2 */
	 /* .param p1, "activity" # Landroid/app/Activity; */
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 44 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 46 */
	 /* if-nez p1, :cond_0 */
	 /* .line 47 */
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 final String v1 = "Activity cannot be null."; // const-string v1, "Activity cannot be null."
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
	 /* .line 51 */
} // :cond_0
this.fParentActivity = p1;
/* .line 52 */
final String v0 = ""; // const-string v0, ""
this.fInMobiApplicationId = v0;
/* .line 54 */
this.fInMobiTimer = v1;
/* .line 55 */
final String v0 = ""; // const-string v0, ""
this.fInneractiveApplicationId = v0;
/* .line 56 */
this.fInneractiveAdViewGroup = v1;
/* .line 57 */
return;
} // .end method
static java.lang.String access$000 ( com.ansca.corona.AdManager p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/AdManager; */
/* .prologue */
/* .line 19 */
v0 = this.fInMobiApplicationId;
} // .end method
static android.app.Activity access$100 ( com.ansca.corona.AdManager p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/AdManager; */
/* .prologue */
/* .line 19 */
v0 = this.fParentActivity;
} // .end method
static java.util.Timer access$300 ( com.ansca.corona.AdManager p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/AdManager; */
/* .prologue */
/* .line 19 */
v0 = this.fInMobiTimer;
} // .end method
static java.util.Timer access$302 ( com.ansca.corona.AdManager p0, java.util.Timer p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/AdManager; */
/* .param p1, "x1" # Ljava/util/Timer; */
/* .prologue */
/* .line 19 */
this.fInMobiTimer = p1;
} // .end method
static android.view.ViewGroup access$500 ( com.ansca.corona.AdManager p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/AdManager; */
/* .prologue */
/* .line 19 */
v0 = this.fInneractiveAdViewGroup;
} // .end method
static android.view.ViewGroup access$502 ( com.ansca.corona.AdManager p0, android.view.ViewGroup p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/AdManager; */
/* .param p1, "x1" # Landroid/view/ViewGroup; */
/* .prologue */
/* .line 19 */
this.fInneractiveAdViewGroup = p1;
} // .end method
/* # virtual methods */
public java.lang.String getInMobiApplicationId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 245 */
v0 = this.fInMobiApplicationId;
} // .end method
public java.lang.String getInneractiveApplicationId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 511 */
v0 = this.fInneractiveApplicationId;
} // .end method
public void hideAllAds ( ) {
/* .locals 0 */
/* .prologue */
/* .line 61 */
(( com.ansca.corona.AdManager ) p0 ).hideInMobiAd ( ); // invoke-virtual {p0}, Lcom/ansca/corona/AdManager;->hideInMobiAd()V
/* .line 62 */
(( com.ansca.corona.AdManager ) p0 ).hideInneractiveAd ( ); // invoke-virtual {p0}, Lcom/ansca/corona/AdManager;->hideInneractiveAd()V
/* .line 63 */
return;
} // .end method
public void hideInMobiAd ( ) {
/* .locals 0 */
/* .prologue */
return;
} // .end method
public void hideInneractiveAd ( ) {
/* .locals 2 */
/* .prologue */
/* .line 653 */
v0 = this.fParentActivity;
/* if-nez v0, :cond_1 */
/* .line 674 */
} // :cond_0
} // :goto_0
return;
/* .line 658 */
} // :cond_1
v0 = this.fInneractiveAdViewGroup;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 663 */
v0 = this.fParentActivity;
/* new-instance v1, Lcom/ansca/corona/AdManager$4; */
/* invoke-direct {v1, p0}, Lcom/ansca/corona/AdManager$4;-><init>(Lcom/ansca/corona/AdManager;)V */
(( android.app.Activity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
} // .end method
public Boolean isInMobiAdShown ( ) {
/* .locals 1 */
/* .prologue */
/* .line 390 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isInneractiveAdShown ( ) {
/* .locals 1 */
/* .prologue */
/* .line 681 */
v0 = this.fInneractiveAdViewGroup;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void setInMobiApplicationId ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "id" # Ljava/lang/String; */
/* .prologue */
/* .line 237 */
if ( p1 != null) { // if-eqz p1, :cond_0
} // .end local p1 # "id":Ljava/lang/String;
} // :goto_0
this.fInMobiApplicationId = p1;
/* .line 238 */
return;
/* .line 237 */
/* .restart local p1 # "id":Ljava/lang/String; */
} // :cond_0
final String p1 = ""; // const-string p1, ""
} // .end method
public void setInneractiveApplicationId ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "id" # Ljava/lang/String; */
/* .prologue */
/* .line 503 */
if ( p1 != null) { // if-eqz p1, :cond_0
} // .end local p1 # "id":Ljava/lang/String;
} // :goto_0
this.fInneractiveApplicationId = p1;
/* .line 504 */
return;
/* .line 503 */
/* .restart local p1 # "id":Ljava/lang/String; */
} // :cond_0
final String p1 = ""; // const-string p1, ""
} // .end method
public void showInMobiAd ( java.lang.String p0, Float p1, Float p2, Double p3, Boolean p4 ) {
/* .locals 10 */
/* .param p1, "bannerTypeName" # Ljava/lang/String; */
/* .param p2, "x" # F */
/* .param p3, "y" # F */
/* .param p4, "intervalInSeconds" # D */
/* .param p6, "testModeEnabled" # Z */
/* .prologue */
/* .line 261 */
v0 = this.fParentActivity;
/* if-nez v0, :cond_1 */
/* .line 349 */
} // :cond_0
} // :goto_0
return;
/* .line 266 */
} // :cond_1
v0 = this.fInMobiApplicationId;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.fInMobiApplicationId;
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-lez v0, :cond_0 */
/* .line 272 */
v3 = this.fInMobiApplicationId;
/* .line 275 */
/* .local v3, "copyOfInMobiApplicationId":Ljava/lang/String; */
v9 = this.fParentActivity;
/* new-instance v0, Lcom/ansca/corona/AdManager$1; */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move/from16 v4, p6 */
/* move v5, p2 */
/* move v6, p3 */
/* move-wide v7, p4 */
/* invoke-direct/range {v0 ..v8}, Lcom/ansca/corona/AdManager$1;-><init>(Lcom/ansca/corona/AdManager;Ljava/lang/String;Ljava/lang/String;ZFFD)V */
(( android.app.Activity ) v9 ).runOnUiThread ( v0 ); // invoke-virtual {v9, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
} // .end method
public void showInneractiveAd ( java.lang.String p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 13 */
/* .param p1, "adTypeName" # Ljava/lang/String; */
/* .param p2, "x" # I */
/* .param p3, "y" # I */
/* .param p4, "intervalInSeconds" # I */
/* .prologue */
/* .line 525 */
v1 = this.fParentActivity;
/* if-nez v1, :cond_1 */
/* .line 646 */
} // :cond_0
} // :goto_0
return;
/* .line 530 */
} // :cond_1
v1 = this.fInneractiveApplicationId;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 536 */
v3 = this.fInneractiveApplicationId;
/* .line 540 */
/* .local v3, "copyOfInneractiveApplicationId":Ljava/lang/String; */
(( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
(( java.lang.String ) v1 ).toLowerCase ( ); // invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
/* .line 541 */
/* .local v11, "lowerCaseAdTypeName":Ljava/lang/String; */
final String v1 = "banner"; // const-string v1, "banner"
v1 = (( java.lang.String ) v11 ).equals ( v1 ); // invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 542 */
int v10 = 0; // const/4 v10, 0x0
/* .line 555 */
/* .local v10, "integerId":B */
} // :goto_1
/* move v4, v10 */
/* .line 558 */
/* .local v4, "adTypeId":B */
/* const/16 v9, 0x1e */
/* .line 559 */
/* .local v9, "MIN_INTERVAL_IN_SECONDS":I */
/* const/16 v8, 0x12c */
/* .line 560 */
/* .local v8, "MAX_INTERVAL_IN_SECONDS":I */
/* const/16 v1, 0x1e */
/* move/from16 v0, p4 */
/* if-ge v0, v1, :cond_6 */
/* .line 561 */
/* const/16 p4, 0x1e */
/* .line 562 */
final String v1 = "Corona"; // const-string v1, "Corona"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "Inneractive ads cannot be set up with an interval less than "; // const-string v6, "Inneractive ads cannot be set up with an interval less than "
(( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v6, 0x1e */
java.lang.Integer .toString ( v6 );
(( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = " seconds.Changing the interval to the minimum allowed value."; // const-string v6, " seconds.Changing the interval to the minimum allowed value."
(( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v1,v2 );
/* .line 572 */
} // :cond_2
} // :goto_2
/* move/from16 v5, p4 */
/* .line 575 */
/* .local v5, "finalIntervalInSeconds":I */
v12 = this.fParentActivity;
/* new-instance v1, Lcom/ansca/corona/AdManager$3; */
/* move-object v2, p0 */
/* move v6, p2 */
/* move/from16 v7, p3 */
/* invoke-direct/range {v1 ..v7}, Lcom/ansca/corona/AdManager$3;-><init>(Lcom/ansca/corona/AdManager;Ljava/lang/String;BIII)V */
(( android.app.Activity ) v12 ).runOnUiThread ( v1 ); // invoke-virtual {v12, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 544 */
} // .end local v4 # "adTypeId":B
} // .end local v5 # "finalIntervalInSeconds":I
} // .end local v8 # "MAX_INTERVAL_IN_SECONDS":I
} // .end local v9 # "MIN_INTERVAL_IN_SECONDS":I
} // .end local v10 # "integerId":B
} // :cond_3
final String v1 = "text"; // const-string v1, "text"
v1 = (( java.lang.String ) v11 ).equals ( v1 ); // invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 545 */
int v10 = 1; // const/4 v10, 0x1
/* .restart local v10 # "integerId":B */
/* .line 547 */
} // .end local v10 # "integerId":B
} // :cond_4
final String v1 = "fullscreen"; // const-string v1, "fullscreen"
v1 = (( java.lang.String ) v11 ).equals ( v1 ); // invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 548 */
int v10 = 2; // const/4 v10, 0x2
/* .restart local v10 # "integerId":B */
/* .line 551 */
} // .end local v10 # "integerId":B
} // :cond_5
final String v1 = "Corona"; // const-string v1, "Corona"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "Inneractive does not support ad name \'"; // const-string v6, "Inneractive does not support ad name \'"
(( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = "\' given to ads.show() function."; // const-string v6, "\' given to ads.show() function."
(( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v1,v2 );
/* goto/16 :goto_0 */
/* .line 566 */
/* .restart local v4 # "adTypeId":B */
/* .restart local v8 # "MAX_INTERVAL_IN_SECONDS":I */
/* .restart local v9 # "MIN_INTERVAL_IN_SECONDS":I */
/* .restart local v10 # "integerId":B */
} // :cond_6
/* const/16 v1, 0x12c */
/* move/from16 v0, p4 */
/* if-le v0, v1, :cond_2 */
/* .line 567 */
/* const/16 p4, 0x12c */
/* .line 568 */
final String v1 = "Corona"; // const-string v1, "Corona"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "Inneractive ads cannot be set up with an interval greater than "; // const-string v6, "Inneractive ads cannot be set up with an interval greater than "
(( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v6, 0x12c */
java.lang.Integer .toString ( v6 );
(( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = " seconds.Changing the interval to the maximum allowed value."; // const-string v6, " seconds.Changing the interval to the maximum allowed value."
(( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v1,v2 );
} // .end method
