public class com.nobleempire.GunDisassembly2.NvEventQueueActivity$ScreenReceiver extends android.content.BroadcastReceiver {
	 /* .source "NvEventQueueActivity.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "ScreenReceiver" */
} // .end annotation
/* # instance fields */
final com.nobleempire.GunDisassembly2.NvEventQueueActivity this$0; //synthetic
public Boolean wasScreenOn;
/* # direct methods */
public com.nobleempire.GunDisassembly2.NvEventQueueActivity$ScreenReceiver ( ) {
/* .locals 1 */
/* .prologue */
/* .line 939 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
/* .line 940 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$ScreenReceiver;->wasScreenOn:Z */
return;
} // .end method
/* # virtual methods */
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 3 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "intent" # Landroid/content/Intent; */
/* .prologue */
/* .line 943 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "~~ ******** BroadcastReceiver: "; // const-string v2, "~~ ******** BroadcastReceiver: "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " ********"; // const-string v2, " ********"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,v1 );
/* .line 944 */
(( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
final String v1 = "android.intent.action.SCREEN_OFF"; // const-string v1, "android.intent.action.SCREEN_OFF"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 945 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$ScreenReceiver;->wasScreenOn:Z */
	 /* .line 958 */
} // :cond_0
} // :goto_0
return;
/* .line 946 */
} // :cond_1
(( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
final String v1 = "android.intent.action.SCREEN_ON"; // const-string v1, "android.intent.action.SCREEN_ON"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 947 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity$ScreenReceiver;->wasScreenOn:Z */
/* .line 948 */
v0 = this.this$0;
/* iget-boolean v0, v0, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->paused:Z */
/* if-nez v0, :cond_0 */
/* .line 949 */
v0 = this.this$0;
(( com.nobleempire.GunDisassembly2.NvEventQueueActivity ) v0 ).userPresentEvent ( ); // invoke-virtual {v0}, Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity;->userPresentEvent()V
/* .line 951 */
} // :cond_2
(( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
final String v1 = "android.intent.action.USER_PRESENT"; // const-string v1, "android.intent.action.USER_PRESENT"
(( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
