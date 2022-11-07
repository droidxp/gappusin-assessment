public class com.admob.android.ads.d$a {
	 /* .source "AdView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/admob/android/ads/d; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x60c */
/* name = "a" */
} // .end annotation
/* # instance fields */
java.lang.ref.WeakReference a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ref/WeakReference", */
/* "<", */
/* "Lcom/admob/android/ads/AdView;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.admob.android.ads.d$a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 717 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 718 */
/* new-instance v0, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.a = v0;
/* .line 719 */
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 726 */
v0 = this.a;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast p0, Lcom/admob/android/ads/AdView; */
/* .line 727 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 729 */
com.admob.android.ads.AdView .c ( p0 );
/* .line 731 */
} // :cond_0
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 6 */
/* .prologue */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
/* .line 738 */
v0 = this.a;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast p0, Lcom/admob/android/ads/AdView; */
/* .line 739 */
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 741 */
/* monitor-enter p0 */
/* .line 744 */
try { // :try_start_0
com.admob.android.ads.AdView .a ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_2
	 com.admob.android.ads.AdView .a ( p0 );
	 (( com.admob.android.ads.g ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/admob/android/ads/g;->b()Lcom/admob/android/ads/d;
	 v0 = 	 (( com.admob.android.ads.d ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Lcom/admob/android/ads/d;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 746 */
		 final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
		 int v1 = 3; // const/4 v1, 0x3
		 v0 = 		 android.util.Log .isLoggable ( v0,v1 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 748 */
			 final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
			 final String v1 = "Received the same ad we already had.Discarding it."; // const-string v1, "Received the same ad we already had.Discarding it."
			 android.util.Log .d ( v0,v1 );
			 /* .line 761 */
		 } // :cond_0
	 } // :goto_0
	 /* monitor-exit p0 */
	 /* .line 763 */
} // :cond_1
return;
/* .line 753 */
} // :cond_2
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
int v1 = 4; // const/4 v1, 0x4
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 755 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Ad returned ("; // const-string v2, "Ad returned ("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v2 */
com.admob.android.ads.AdView .g ( p0 );
/* move-result-wide v4 */
/* sub-long/2addr v2, v4 */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v2 = " ms): "; // const-string v2, " ms): "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 759 */
} // :cond_3
(( com.admob.android.ads.AdView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/admob/android/ads/AdView;->getContext()Landroid/content/Context;
(( com.admob.android.ads.d ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/admob/android/ads/d;->b()Lcom/admob/android/ads/g;
(( com.admob.android.ads.AdView ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/admob/android/ads/AdView;->a(Lcom/admob/android/ads/d;Lcom/admob/android/ads/g;)V
/* .line 761 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
