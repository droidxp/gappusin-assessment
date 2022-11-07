class com.google.ads.mediation.customevent.CustomEventAdapter$b implements com.google.ads.mediation.customevent.CustomEventInterstitialListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/mediation/customevent/CustomEventAdapter; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "b" */
} // .end annotation
/* # instance fields */
final com.google.ads.mediation.customevent.CustomEventAdapter a; //synthetic
private final com.google.ads.mediation.MediationInterstitialListener b;
/* # direct methods */
public com.google.ads.mediation.customevent.CustomEventAdapter$b ( ) {
/* .locals 0 */
/* .prologue */
/* .line 157 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 158 */
this.b = p2;
/* .line 159 */
return;
} // .end method
private java.lang.String a ( ) {
/* .locals 2 */
/* .prologue */
/* .line 195 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Interstitial custom event labeled \'"; // const-string v1, "Interstitial custom event labeled \'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
com.google.ads.mediation.customevent.CustomEventAdapter .a ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\'"; // const-string v1, "\'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
/* # virtual methods */
public void onDismissScreen ( ) {
/* .locals 2 */
/* .prologue */
/* .line 184 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* invoke-direct {p0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->a()Ljava/lang/String; */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " called onDismissScreen()."; // const-string v1, " called onDismissScreen()."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .a ( v0 );
/* .line 185 */
v0 = this.b;
v1 = this.a;
/* .line 186 */
return;
} // .end method
public void onFailedToReceiveAd ( ) {
/* .locals 3 */
/* .prologue */
/* .line 169 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* invoke-direct {p0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->a()Ljava/lang/String; */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " called onFailedToReceiveAd()."; // const-string v1, " called onFailedToReceiveAd()."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .a ( v0 );
/* .line 172 */
v0 = this.b;
v1 = this.a;
v2 = com.google.ads.AdRequest$ErrorCode.NO_FILL;
/* .line 174 */
return;
} // .end method
public synchronized void onLeaveApplication ( ) {
/* .locals 2 */
/* .prologue */
/* .line 190 */
/* monitor-enter p0 */
try { // :try_start_0
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 /* invoke-direct {p0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->a()Ljava/lang/String; */
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v1 = " called onLeaveApplication()."; // const-string v1, " called onLeaveApplication()."
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 com.google.ads.util.b .a ( v0 );
	 /* .line 191 */
	 v0 = this.b;
	 v1 = this.a;
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 192 */
	 /* monitor-exit p0 */
	 return;
	 /* .line 190 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public void onPresentScreen ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 178 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 /* invoke-direct {p0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->a()Ljava/lang/String; */
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v1 = " called onPresentScreen()."; // const-string v1, " called onPresentScreen()."
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 com.google.ads.util.b .a ( v0 );
	 /* .line 179 */
	 v0 = this.b;
	 v1 = this.a;
	 /* .line 180 */
	 return;
} // .end method
public void onReceivedAd ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 163 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 /* invoke-direct {p0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter$b;->a()Ljava/lang/String; */
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v1 = " called onReceivedAd."; // const-string v1, " called onReceivedAd."
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 com.google.ads.util.b .a ( v0 );
	 /* .line 164 */
	 v0 = this.b;
	 v1 = this.a;
	 /* .line 165 */
	 return;
} // .end method
