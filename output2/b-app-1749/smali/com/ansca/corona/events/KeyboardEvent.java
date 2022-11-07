public class com.ansca.corona.events.KeyboardEvent extends com.ansca.corona.events.Event {
	 /* .source "KeyboardEvent.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/ansca/corona/events/KeyboardEvent$NonOverriddenKeyEvent;, */
	 /* Lcom/ansca/corona/events/KeyboardEvent$Phase; */
	 /* } */
} // .end annotation
/* # instance fields */
private android.view.KeyEvent fKeyEvent;
/* # direct methods */
public com.ansca.corona.events.KeyboardEvent ( ) {
	 /* .locals 0 */
	 /* .param p1, "keyEvent" # Landroid/view/KeyEvent; */
	 /* .prologue */
	 /* .line 18 */
	 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
	 /* .line 19 */
	 this.fKeyEvent = p1;
	 /* .line 20 */
	 return;
} // .end method
static android.view.KeyEvent access$000 ( com.ansca.corona.events.KeyboardEvent p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/ansca/corona/events/KeyboardEvent; */
	 /* .prologue */
	 /* .line 8 */
	 v0 = this.fKeyEvent;
} // .end method
public static java.lang.String getStringForKeyCode ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "keyCode" # I */
	 /* .prologue */
	 /* .line 60 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 62 */
	 /* .local v0, "keyName":Ljava/lang/String; */
	 /* sparse-switch p0, :sswitch_data_0 */
	 /* .line 99 */
} // :goto_0
/* .line 65 */
/* :sswitch_0 */
final String v0 = "back"; // const-string v0, "back"
/* .line 66 */
/* .line 68 */
/* :sswitch_1 */
final String v0 = "menu"; // const-string v0, "menu"
/* .line 69 */
/* .line 71 */
/* :sswitch_2 */
final String v0 = "search"; // const-string v0, "search"
/* .line 72 */
/* .line 74 */
/* :sswitch_3 */
final String v0 = "center"; // const-string v0, "center"
/* .line 75 */
/* .line 77 */
/* :sswitch_4 */
final String v0 = "down"; // const-string v0, "down"
/* .line 78 */
/* .line 80 */
/* :sswitch_5 */
final String v0 = "left"; // const-string v0, "left"
/* .line 81 */
/* .line 83 */
/* :sswitch_6 */
final String v0 = "right"; // const-string v0, "right"
/* .line 84 */
/* .line 86 */
/* :sswitch_7 */
final String v0 = "up"; // const-string v0, "up"
/* .line 87 */
/* .line 89 */
/* :sswitch_8 */
final String v0 = "volumeUp"; // const-string v0, "volumeUp"
/* .line 90 */
/* .line 92 */
/* :sswitch_9 */
final String v0 = "volumeDown"; // const-string v0, "volumeDown"
/* .line 93 */
/* .line 95 */
/* :sswitch_a */
final String v0 = "camera"; // const-string v0, "camera"
/* .line 62 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x4 -> :sswitch_0 */
/* 0x13 -> :sswitch_7 */
/* 0x14 -> :sswitch_4 */
/* 0x15 -> :sswitch_5 */
/* 0x16 -> :sswitch_6 */
/* 0x17 -> :sswitch_3 */
/* 0x18 -> :sswitch_8 */
/* 0x19 -> :sswitch_9 */
/* 0x1b -> :sswitch_a */
/* 0x52 -> :sswitch_1 */
/* 0x54 -> :sswitch_2 */
} // .end sparse-switch
} // .end method
/* # virtual methods */
public void Send ( ) {
/* .locals 5 */
/* .prologue */
/* .line 28 */
v3 = this.fKeyEvent;
if ( v3 != null) { // if-eqz v3, :cond_0
v3 = com.ansca.corona.Controller .isValid ( );
/* if-nez v3, :cond_1 */
/* .line 52 */
} // :cond_0
} // :goto_0
return;
/* .line 33 */
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
/* .line 34 */
/* .local v2, "wasKeyOverridden":Z */
v3 = this.fKeyEvent;
v3 = (( android.view.KeyEvent ) v3 ).getAction ( ); // invoke-virtual {v3}, Landroid/view/KeyEvent;->getAction()I
int v4 = 1; // const/4 v4, 0x1
/* if-ne v3, v4, :cond_3 */
v1 = com.ansca.corona.events.KeyboardEvent$Phase.UP;
/* .line 35 */
/* .local v1, "phase":Lcom/ansca/corona/events/KeyboardEvent$Phase; */
} // :goto_1
v3 = this.fKeyEvent;
v3 = (( android.view.KeyEvent ) v3 ).getKeyCode ( ); // invoke-virtual {v3}, Landroid/view/KeyEvent;->getKeyCode()I
com.ansca.corona.events.KeyboardEvent .getStringForKeyCode ( v3 );
/* .line 36 */
/* .local v0, "keyName":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_2
v3 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-lez v3, :cond_2 */
/* .line 37 */
v3 = (( com.ansca.corona.events.KeyboardEvent$Phase ) v1 ).getValue ( ); // invoke-virtual {v1}, Lcom/ansca/corona/events/KeyboardEvent$Phase;->getValue()I
v2 = com.ansca.corona.JavaToNativeShim .keyEvent ( v3,v0 );
/* .line 41 */
} // :cond_2
/* if-nez v2, :cond_0 */
/* .line 42 */
com.ansca.corona.Controller .getActivity ( );
/* new-instance v4, Lcom/ansca/corona/events/KeyboardEvent$1; */
/* invoke-direct {v4, p0}, Lcom/ansca/corona/events/KeyboardEvent$1;-><init>(Lcom/ansca/corona/events/KeyboardEvent;)V */
(( com.ansca.corona.CoronaActivity ) v3 ).runOnUiThread ( v4 ); // invoke-virtual {v3, v4}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 34 */
} // .end local v0 # "keyName":Ljava/lang/String;
} // .end local v1 # "phase":Lcom/ansca/corona/events/KeyboardEvent$Phase;
} // :cond_3
v1 = com.ansca.corona.events.KeyboardEvent$Phase.DOWN;
} // .end method
