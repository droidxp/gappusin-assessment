class com.google.ads.mediation.customevent.CustomEventAdapter$a implements com.google.ads.mediation.customevent.CustomEventBannerListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/mediation/customevent/CustomEventAdapter; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "a" */
} // .end annotation
/* # instance fields */
final com.google.ads.mediation.customevent.CustomEventAdapter a; //synthetic
private android.view.View b;
private final com.google.ads.mediation.MediationBannerListener c;
/* # direct methods */
public com.google.ads.mediation.customevent.CustomEventAdapter$a ( ) {
/* .locals 0 */
/* .prologue */
/* .line 48 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 49 */
this.c = p2;
/* .line 50 */
return;
} // .end method
private java.lang.String b ( ) {
/* .locals 2 */
/* .prologue */
/* .line 99 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Banner custom event labeled \'"; // const-string v1, "Banner custom event labeled \'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
com.google.ads.mediation.customevent.CustomEventAdapter .a ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\'"; // const-string v1, "\'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
/* # virtual methods */
public synchronized android.view.View a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 95 */
/* monitor-enter p0 */
try { // :try_start_0
	 v0 = this.b;
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* monitor-exit p0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public void onClick ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 72 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 /* invoke-direct {p0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->b()Ljava/lang/String; */
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v1 = " called onClick()."; // const-string v1, " called onClick()."
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 com.google.ads.util.b .a ( v0 );
	 /* .line 73 */
	 v0 = this.c;
	 v1 = this.a;
	 /* .line 74 */
	 return;
} // .end method
public void onDismissScreen ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 84 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 /* invoke-direct {p0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->b()Ljava/lang/String; */
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v1 = " called onDismissScreen()."; // const-string v1, " called onDismissScreen()."
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 com.google.ads.util.b .a ( v0 );
	 /* .line 85 */
	 v0 = this.c;
	 v1 = this.a;
	 /* .line 86 */
	 return;
} // .end method
public void onFailedToReceiveAd ( ) {
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 63 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 /* invoke-direct {p0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->b()Ljava/lang/String; */
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v1 = " called onFailedToReceiveAd()."; // const-string v1, " called onFailedToReceiveAd()."
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 com.google.ads.util.b .a ( v0 );
	 /* .line 66 */
	 v0 = this.c;
	 v1 = this.a;
	 v2 = com.google.ads.AdRequest$ErrorCode.NO_FILL;
	 /* .line 68 */
	 return;
} // .end method
public synchronized void onLeaveApplication ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 90 */
	 /* monitor-enter p0 */
	 try { // :try_start_0
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 /* invoke-direct {p0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->b()Ljava/lang/String; */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v1 = " called onLeaveApplication()."; // const-string v1, " called onLeaveApplication()."
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.google.ads.util.b .a ( v0 );
		 /* .line 91 */
		 v0 = this.c;
		 v1 = this.a;
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 92 */
		 /* monitor-exit p0 */
		 return;
		 /* .line 90 */
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* monitor-exit p0 */
		 /* throw v0 */
	 } // .end method
	 public void onPresentScreen ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 78 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 /* invoke-direct {p0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->b()Ljava/lang/String; */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v1 = " called onPresentScreen()."; // const-string v1, " called onPresentScreen()."
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.google.ads.util.b .a ( v0 );
		 /* .line 79 */
		 v0 = this.c;
		 v1 = this.a;
		 /* .line 80 */
		 return;
	 } // .end method
	 public synchronized void onReceivedAd ( android.view.View p0 ) {
		 /* .locals 2 */
		 /* .param p1, "view" # Landroid/view/View; */
		 /* .prologue */
		 /* .line 56 */
		 /* monitor-enter p0 */
		 try { // :try_start_0
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
			 /* invoke-direct {p0}, Lcom/google/ads/mediation/customevent/CustomEventAdapter$a;->b()Ljava/lang/String; */
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v1 = " called onReceivedAd."; // const-string v1, " called onReceivedAd."
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 com.google.ads.util.b .a ( v0 );
			 /* .line 57 */
			 this.b = p1;
			 /* .line 58 */
			 v0 = this.c;
			 v1 = this.a;
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* .line 59 */
			 /* monitor-exit p0 */
			 return;
			 /* .line 56 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit p0 */
			 /* throw v0 */
		 } // .end method
