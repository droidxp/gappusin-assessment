public abstract class net.chobin.android.psdxylz.app.a extends android.app.Activity {
	 /* # static fields */
	 public static Integer a;
	 public static android.widget.RelativeLayout a;
	 public static net.chobin.android.psdxylz.app.ak a;
	 public static net.chobin.android.psdxylz.app.al a;
	 public static net.chobin.android.psdxylz.app.ap a;
	 public static net.chobin.android.psdxylz.app.d a;
	 public static net.chobin.android.psdxylz.app.g a;
	 public static net.chobin.android.psdxylz.app.l a;
	 public static net.chobin.android.psdxylz.app.w a;
	 public static Boolean a;
	 /* # instance fields */
	 public android.os.Handler a;
	 private net.chobin.android.psdxylz.app.b a;
	 public net.chobin.android.psdxylz.app.k a;
	 public net.chobin.android.psdxylz.r a;
	 /* # direct methods */
	 static net.chobin.android.psdxylz.app.a ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 int v0 = 0; // const/4 v0, 0x0
		 net.chobin.android.psdxylz.app.a.a = (v1!= 0);
		 return;
	 } // .end method
	 public net.chobin.android.psdxylz.app.a ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 this.a = v1;
		 this.a = v1;
		 this.a = v1;
		 /* new-instance v0, Lnet/chobin/android/psdxylz/app/b; */
		 /* invoke-direct {v0, p0, v1}, Lnet/chobin/android/psdxylz/app/b;-><init>(Lnet/chobin/android/psdxylz/app/a;Lnet/chobin/android/psdxylz/app/b;)V */
		 this.a = v0;
		 return;
	 } // .end method
	 static net.chobin.android.psdxylz.app.b a ( Object p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.a;
	 } // .end method
	 static void a ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lnet/chobin/android/psdxylz/app/a;->c()V */
		 return;
	 } // .end method
	 private void c ( ) {
		 /* .locals 2 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.a;
			 v0 = this.a;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v0 = this.a;
				 v0 = this.a;
				 (( net.chobin.android.psdxylz.app.f ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/f;->a()V
			 } // :cond_0
			 v0 = net.chobin.android.psdxylz.app.a.a;
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 v0 = net.chobin.android.psdxylz.app.a.a;
				 (( net.chobin.android.psdxylz.app.ak ) v0 ).f ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/ak;->f()V
			 } // :cond_1
			 v0 = net.chobin.android.psdxylz.app.a.a;
			 if ( v0 != null) { // if-eqz v0, :cond_2
				 v0 = net.chobin.android.psdxylz.app.a.a;
				 (( net.chobin.android.psdxylz.app.l ) v0 ).b ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/l;->b()V
			 } // :cond_2
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 final String v1 = "sound resume!!!! mainThreadObj:"; // const-string v1, "sound resume!!!! mainThreadObj:"
			 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 v1 = net.chobin.android.psdxylz.app.k.a;
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 net.chobin.android.psdxylz.app.r .a ( v0 );
			 return;
		 } // .end method
		 /* # virtual methods */
		 public abstract net.chobin.android.psdxylz.app.k a ( android.app.Activity p0 ) {
		 } // .end method
		 public abstract void a ( ) {
		 } // .end method
		 public abstract void a ( android.os.Bundle p0 ) {
		 } // .end method
		 public synchronized void b ( ) {
			 /* .locals 3 */
			 /* monitor-enter p0 */
			 try { // :try_start_0
				 final String v0 = "keyguard"; // const-string v0, "keyguard"
				 (( net.chobin.android.psdxylz.app.a ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Lnet/chobin/android/psdxylz/app/a;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
				 /* check-cast v0, Landroid/app/KeyguardManager; */
				 v0 = 				 (( android.app.KeyguardManager ) v0 ).inKeyguardRestrictedInputMode ( ); // invoke-virtual {v0}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z
				 net.chobin.android.psdxylz.app.a.a = (v0!= 0);
				 /* sget-boolean v0, Lnet/chobin/android/psdxylz/app/a;->a:Z */
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 v0 = this.a;
					 /* new-instance v1, Landroid/content/IntentFilter; */
					 final String v2 = "android.intent.action.USER_PRESENT"; // const-string v2, "android.intent.action.USER_PRESENT"
					 /* invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
					 (( net.chobin.android.psdxylz.app.a ) p0 ).registerReceiver ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lnet/chobin/android/psdxylz/app/a;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 } // :cond_0
				 /* monitor-exit p0 */
				 return;
				 /* :catchall_0 */
				 /* move-exception v0 */
				 /* monitor-exit p0 */
				 /* throw v0 */
			 } // .end method
			 public Boolean dispatchKeyEvent ( android.view.KeyEvent p0 ) {
				 /* .locals 3 */
				 int v2 = 0; // const/4 v2, 0x0
				 int v0 = 1; // const/4 v0, 0x1
				 v1 = 				 (( android.view.KeyEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I
				 /* packed-switch v1, :pswitch_data_0 */
			 } // :goto_0
			 v0 = 			 /* invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z */
		 } // :cond_0
	 } // :goto_1
	 /* :pswitch_0 */
	 v1 = 	 (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
	 /* sparse-switch v1, :sswitch_data_0 */
	 /* :sswitch_0 */
	 v1 = this.a;
	 v1 = this.a;
	 v1 = 	 (( net.chobin.android.psdxylz.app.f ) v1 ).c ( ); // invoke-virtual {v1}, Lnet/chobin/android/psdxylz/app/f;->c()Z
	 /* if-nez v1, :cond_0 */
	 v1 = this.a;
	 v1 = this.a;
	 (( net.chobin.android.psdxylz.app.f ) v1 ).c ( v0 ); // invoke-virtual {v1, v0}, Lnet/chobin/android/psdxylz/app/f;->c(Z)V
	 v1 = this.a;
	 v1 = this.a;
	 (( net.chobin.android.psdxylz.app.f ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lnet/chobin/android/psdxylz/app/f;->a(Z)V
	 v1 = this.a;
	 v1 = this.a;
	 (( net.chobin.android.psdxylz.app.f ) v1 ).b ( v0 ); // invoke-virtual {v1, v0}, Lnet/chobin/android/psdxylz/app/f;->b(Z)V
	 /* :sswitch_1 */
	 v1 = this.a;
	 v1 = this.a;
	 v1 = 	 (( net.chobin.android.psdxylz.app.f ) v1 ).c ( ); // invoke-virtual {v1}, Lnet/chobin/android/psdxylz/app/f;->c()Z
	 /* if-nez v1, :cond_0 */
	 v1 = this.a;
	 v1 = this.a;
	 (( net.chobin.android.psdxylz.app.f ) v1 ).c ( v0 ); // invoke-virtual {v1, v0}, Lnet/chobin/android/psdxylz/app/f;->c(Z)V
	 v1 = this.a;
	 v1 = this.a;
	 (( net.chobin.android.psdxylz.app.f ) v1 ).b ( v2 ); // invoke-virtual {v1, v2}, Lnet/chobin/android/psdxylz/app/f;->b(Z)V
	 v1 = this.a;
	 v1 = this.a;
	 (( net.chobin.android.psdxylz.app.f ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lnet/chobin/android/psdxylz/app/f;->a(Z)V
	 /* :pswitch_1 */
	 v1 = 	 (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
	 /* sparse-switch v1, :sswitch_data_1 */
	 /* :sswitch_2 */
	 v1 = this.a;
	 v1 = this.a;
	 (( net.chobin.android.psdxylz.app.f ) v1 ).b ( v2 ); // invoke-virtual {v1, v2}, Lnet/chobin/android/psdxylz/app/f;->b(Z)V
	 v1 = this.a;
	 v1 = this.a;
	 (( net.chobin.android.psdxylz.app.f ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lnet/chobin/android/psdxylz/app/f;->a(Z)V
	 v1 = this.a;
	 v1 = this.a;
	 (( net.chobin.android.psdxylz.app.f ) v1 ).c ( v2 ); // invoke-virtual {v1, v2}, Lnet/chobin/android/psdxylz/app/f;->c(Z)V
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x0 */
	 /* :pswitch_0 */
	 /* :pswitch_1 */
} // .end packed-switch
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x4 -> :sswitch_0 */
/* 0x52 -> :sswitch_1 */
} // .end sparse-switch
/* :sswitch_data_1 */
/* .sparse-switch */
/* 0x4 -> :sswitch_2 */
/* 0x52 -> :sswitch_2 */
} // .end sparse-switch
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 3 */
int v2 = 1; // const/4 v2, 0x1
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
net.chobin.android.psdxylz.app.r .a ( p0 );
final String v0 = "onCreate"; // const-string v0, "onCreate"
net.chobin.android.psdxylz.app.r .a ( v0 );
/* new-instance v0, Landroid/os/Handler; */
/* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
this.a = v0;
(( net.chobin.android.psdxylz.app.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lnet/chobin/android/psdxylz/app/a;->a(Landroid/os/Bundle;)V
(( net.chobin.android.psdxylz.app.a ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/a;->getWindow()Landroid/view/Window;
/* const/16 v1, 0x80 */
(( android.view.Window ) v0 ).addFlags ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V
int v0 = 3; // const/4 v0, 0x3
(( net.chobin.android.psdxylz.app.a ) p0 ).setVolumeControlStream ( v0 ); // invoke-virtual {p0, v0}, Lnet/chobin/android/psdxylz/app/a;->setVolumeControlStream(I)V
(( net.chobin.android.psdxylz.app.a ) p0 ).requestWindowFeature ( v2 ); // invoke-virtual {p0, v2}, Lnet/chobin/android/psdxylz/app/a;->requestWindowFeature(I)Z
(( net.chobin.android.psdxylz.app.a ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/a;->getWindow()Landroid/view/Window;
int v1 = -3; // const/4 v1, -0x3
(( android.view.Window ) v0 ).setFormat ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->setFormat(I)V
/* const/high16 v0, 0x7f030000 */
(( net.chobin.android.psdxylz.app.a ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lnet/chobin/android/psdxylz/app/a;->setContentView(I)V
/* const/high16 v0, 0x7f070000 */
(( net.chobin.android.psdxylz.app.a ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lnet/chobin/android/psdxylz/app/a;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/RelativeLayout; */
(( net.chobin.android.psdxylz.app.a ) p0 ).a ( p0 ); // invoke-virtual {p0, p0}, Lnet/chobin/android/psdxylz/app/a;->a(Landroid/app/Activity;)Lnet/chobin/android/psdxylz/app/k;
this.a = v0;
v0 = net.chobin.android.psdxylz.app.a.a;
v1 = this.a;
(( android.widget.RelativeLayout ) v0 ).addView ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
/* new-instance v0, Lnet/chobin/android/psdxylz/app/d; */
v1 = net.chobin.android.psdxylz.app.a.a;
/* invoke-direct {v0, p0, v1}, Lnet/chobin/android/psdxylz/app/d;-><init>(Lnet/chobin/android/psdxylz/app/a;Landroid/widget/RelativeLayout;)V */
v0 = net.chobin.android.psdxylz.app.a.a;
(( net.chobin.android.psdxylz.app.d ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/d;->a()V
v0 = net.chobin.android.psdxylz.app.a.a;
/* if-nez v0, :cond_3 */
/* new-instance v0, Lnet/chobin/android/psdxylz/app/ap; */
/* invoke-direct {v0, p0}, Lnet/chobin/android/psdxylz/app/ap;-><init>(Lnet/chobin/android/psdxylz/app/a;)V */
} // :goto_0
v0 = net.chobin.android.psdxylz.app.a.a;
(( net.chobin.android.psdxylz.app.ap ) v0 ).a ( v2, v2 ); // invoke-virtual {v0, v2, v2}, Lnet/chobin/android/psdxylz/app/ap;->a(ZZ)V
(( net.chobin.android.psdxylz.app.a ) p0 ).a ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/a;->a()V
v0 = net.chobin.android.psdxylz.app.a.a;
/* if-nez v0, :cond_4 */
/* new-instance v0, Lnet/chobin/android/psdxylz/app/w; */
v1 = this.a;
/* invoke-direct {v0, v1}, Lnet/chobin/android/psdxylz/app/w;-><init>(Lnet/chobin/android/psdxylz/app/k;)V */
} // :goto_1
v0 = net.chobin.android.psdxylz.app.a.a;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lnet/chobin/android/psdxylz/app/al; */
/* invoke-direct {v0, p0}, Lnet/chobin/android/psdxylz/app/al;-><init>(Landroid/content/Context;)V */
try { // :try_start_0
v0 = net.chobin.android.psdxylz.app.a.a;
int v1 = 0; // const/4 v1, 0x0
/* const/16 v2, 0x38 */
v0 = (( net.chobin.android.psdxylz.app.al ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lnet/chobin/android/psdxylz/app/al;->a(II)I
/* :try_end_0 */
/* .catch Lnet/chobin/android/psdxylz/app/ah; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_0
} // :goto_2
v0 = net.chobin.android.psdxylz.app.a.a;
/* if-nez v0, :cond_1 */
/* new-instance v0, Lnet/chobin/android/psdxylz/app/g; */
/* invoke-direct {v0, p0}, Lnet/chobin/android/psdxylz/app/g;-><init>(Lnet/chobin/android/psdxylz/app/a;)V */
} // :cond_1
/* if-nez v0, :cond_2 */
v0 = net.chobin.android.psdxylz.app.a.a;
(( net.chobin.android.psdxylz.app.g ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/g;->a()V
} // :cond_2
return;
} // :cond_3
v0 = net.chobin.android.psdxylz.app.a.a;
(( net.chobin.android.psdxylz.app.ap ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lnet/chobin/android/psdxylz/app/ap;->a(Lnet/chobin/android/psdxylz/app/a;)V
} // :cond_4
v0 = net.chobin.android.psdxylz.app.a.a;
v1 = this.a;
(( net.chobin.android.psdxylz.app.w ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lnet/chobin/android/psdxylz/app/w;->a(Lnet/chobin/android/psdxylz/app/k;)V
/* :catch_0 */
/* move-exception v0 */
} // .end method
protected android.app.Dialog onCreateDialog ( Integer p0 ) {
/* .locals 1 */
v0 = net.chobin.android.psdxylz.app.a.a;
(( net.chobin.android.psdxylz.app.w ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lnet/chobin/android/psdxylz/app/w;->a(I)Landroid/app/Dialog;
} // .end method
protected void onDestroy ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
v0 = net.chobin.android.psdxylz.app.a.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = net.chobin.android.psdxylz.app.a.a;
(( net.chobin.android.psdxylz.app.d ) v0 ).b ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/d;->b()V
} // :cond_0
v0 = net.chobin.android.psdxylz.app.a.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = net.chobin.android.psdxylz.app.a.a;
(( net.chobin.android.psdxylz.app.g ) v0 ).b ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/g;->b()V
} // :cond_1
v0 = (( net.chobin.android.psdxylz.app.a ) p0 ).isFinishing ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/a;->isFinishing()Z
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = net.chobin.android.psdxylz.app.k.a;
/* if-nez v0, :cond_5 */
v0 = net.chobin.android.psdxylz.app.a.a;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = net.chobin.android.psdxylz.app.a.a;
(( net.chobin.android.psdxylz.app.l ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/l;->a()V
} // :cond_2
v0 = net.chobin.android.psdxylz.app.a.a;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = net.chobin.android.psdxylz.app.a.a;
(( net.chobin.android.psdxylz.app.ak ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/ak;->a()V
} // :cond_3
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = this.a;
(( net.chobin.android.psdxylz.r ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/r;->a()V
} // :cond_4
this.a = v1;
final String v0 = "onDestroy:Release!!"; // const-string v0, "onDestroy:Release!!"
net.chobin.android.psdxylz.app.r .a ( v0 );
} // :cond_5
return;
} // .end method
protected void onPause ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
final String v0 = "onPause"; // const-string v0, "onPause"
net.chobin.android.psdxylz.app.r .a ( v0 );
v0 = net.chobin.android.psdxylz.app.a.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = net.chobin.android.psdxylz.app.a.a;
(( net.chobin.android.psdxylz.app.ak ) v0 ).e ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/ak;->e()V
} // :cond_0
v0 = net.chobin.android.psdxylz.app.a.a;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = net.chobin.android.psdxylz.app.a.a;
(( net.chobin.android.psdxylz.app.l ) v0 ).d ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/l;->d()V
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
net.chobin.android.psdxylz.app.a.a = (v0!= 0);
return;
} // .end method
protected void onRestart ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/app/Activity;->onRestart()V */
final String v0 = "onRestart"; // const-string v0, "onRestart"
net.chobin.android.psdxylz.app.r .a ( v0 );
return;
} // .end method
protected void onRestoreInstanceState ( android.os.Bundle p0 ) {
/* .locals 1 */
final String v0 = "onRestoreInstanceState"; // const-string v0, "onRestoreInstanceState"
net.chobin.android.psdxylz.app.r .a ( v0 );
return;
} // .end method
protected void onResume ( ) {
/* .locals 2 */
/* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
final String v0 = "onResume"; // const-string v0, "onResume"
net.chobin.android.psdxylz.app.r .a ( v0 );
(( net.chobin.android.psdxylz.app.a ) p0 ).b ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/a;->b()V
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "onResume screenLockFlag:"; // const-string v1, "onResume screenLockFlag:"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* sget-boolean v1, Lnet/chobin/android/psdxylz/app/a;->a:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
net.chobin.android.psdxylz.app.r .a ( v0 );
/* sget-boolean v0, Lnet/chobin/android/psdxylz/app/a;->a:Z */
/* if-nez v0, :cond_0 */
/* invoke-direct {p0}, Lnet/chobin/android/psdxylz/app/a;->c()V */
} // :cond_0
return;
} // .end method
protected void onStart ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/app/Activity;->onStart()V */
final String v0 = "onStart"; // const-string v0, "onStart"
net.chobin.android.psdxylz.app.r .a ( v0 );
return;
} // .end method
protected void onStop ( ) {
/* .locals 1 */
/* invoke-super {p0}, Landroid/app/Activity;->onStop()V */
final String v0 = "onStop"; // const-string v0, "onStop"
net.chobin.android.psdxylz.app.r .a ( v0 );
return;
} // .end method
