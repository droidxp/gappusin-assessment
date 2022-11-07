class com.mobfox.sdk.MobFoxView$7 implements java.lang.Runnable {
	 /* .source "MobFoxView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/sdk/MobFoxView;->notifyLoadAdFailed(Ljava/lang/Throwable;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.sdk.MobFoxView this$0; //synthetic
final java.lang.Throwable val$e; //synthetic
/* # direct methods */
 com.mobfox.sdk.MobFoxView$7 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 662 */
this.this$0 = p1;
this.val$e = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 666 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
int v2 = 6; // const/4 v2, 0x6
v1 = android.util.Log .isLoggable ( v1,v2 );
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 667 */
	 final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
	 final String v2 = "Uncaught exception in request thread"; // const-string v2, "Uncaught exception in request thread"
	 v3 = this.val$e;
	 android.util.Log .e ( v1,v2,v3 );
	 /* .line 669 */
} // :cond_0
v1 = this.this$0;
com.mobfox.sdk.MobFoxView .access$500 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_2
	 /* .line 670 */
	 final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
	 int v2 = 3; // const/4 v2, 0x3
	 v1 = 	 android.util.Log .isLoggable ( v1,v2 );
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 671 */
		 final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v3 = "notify bannerListener: "; // const-string v3, "notify bannerListener: "
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v3 = this.this$0;
		 com.mobfox.sdk.MobFoxView .access$500 ( v3 );
		 (( java.lang.Object ) v3 ).getClass ( ); // invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( java.lang.Class ) v3 ).getName ( ); // invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .d ( v1,v2 );
		 /* .line 674 */
	 } // :cond_1
	 v1 = this.val$e;
	 /* instance-of v1, v1, Lcom/mobfox/sdk/RequestException; */
	 if ( v1 != null) { // if-eqz v1, :cond_3
		 /* .line 675 */
		 v0 = this.val$e;
		 /* check-cast v0, Lcom/mobfox/sdk/RequestException; */
		 /* .line 679 */
		 /* .local v0, "ex":Lcom/mobfox/sdk/RequestException; */
	 } // :goto_0
	 v1 = this.this$0;
	 com.mobfox.sdk.MobFoxView .access$500 ( v1 );
	 /* .line 681 */
} // .end local v0 # "ex":Lcom/mobfox/sdk/RequestException;
} // :cond_2
return;
/* .line 677 */
} // :cond_3
/* new-instance v0, Lcom/mobfox/sdk/RequestException; */
v1 = this.val$e;
/* invoke-direct {v0, v1}, Lcom/mobfox/sdk/RequestException;-><init>(Ljava/lang/Throwable;)V */
/* .restart local v0 # "ex":Lcom/mobfox/sdk/RequestException; */
} // .end method
