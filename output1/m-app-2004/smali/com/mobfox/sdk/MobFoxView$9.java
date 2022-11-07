class com.mobfox.sdk.MobFoxView$9 implements java.lang.Runnable {
	 /* .source "MobFoxView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/sdk/MobFoxView;->notifyLoadAdSucceeded()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.sdk.MobFoxView this$0; //synthetic
/* # direct methods */
 com.mobfox.sdk.MobFoxView$9 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 702 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 706 */
v0 = this.this$0;
com.mobfox.sdk.MobFoxView .access$500 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 707 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 int v1 = 3; // const/4 v1, 0x3
	 v0 = 	 android.util.Log .isLoggable ( v0,v1 );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 708 */
		 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "notify bannerListener of load succeeded: "; // const-string v2, "notify bannerListener of load succeeded: "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v2 = this.this$0;
		 com.mobfox.sdk.MobFoxView .access$500 ( v2 );
		 (( java.lang.Object ) v2 ).getClass ( ); // invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .d ( v0,v1 );
		 /* .line 710 */
	 } // :cond_0
	 v0 = this.this$0;
	 com.mobfox.sdk.MobFoxView .access$500 ( v0 );
	 /* .line 712 */
} // :cond_1
return;
} // .end method
