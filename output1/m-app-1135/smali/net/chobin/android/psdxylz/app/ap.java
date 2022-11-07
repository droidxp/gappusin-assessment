public class net.chobin.android.psdxylz.app.ap {
	 /* # instance fields */
	 public Integer a;
	 public net.chobin.android.psdxylz.app.a a;
	 public Boolean a;
	 private Boolean b;
	 /* # direct methods */
	 public net.chobin.android.psdxylz.app.ap ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-boolean v0, p0, Lnet/chobin/android/psdxylz/app/ap;->b:Z */
		 /* iput-boolean v0, p0, Lnet/chobin/android/psdxylz/app/ap;->a:Z */
		 this.a = p1;
		 /* iput-boolean v0, p0, Lnet/chobin/android/psdxylz/app/ap;->b:Z */
		 v0 = 		 (( net.chobin.android.psdxylz.app.ap ) p0 ).a ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/ap;->a()I
		 /* iput v0, p0, Lnet/chobin/android/psdxylz/app/ap;->a:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( net.chobin.android.psdxylz.app.a ) v0 ).getResources ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/a;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v0 ).getConfiguration ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
		 /* iget v0, v0, Landroid/content/res/Configuration;->orientation:I */
		 /* packed-switch v0, :pswitch_data_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
	 /* :pswitch_0 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* nop */
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x2 */
	 /* :pswitch_0 */
} // .end packed-switch
} // .end method
public void a ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lnet/chobin/android/psdxylz/app/ap;->b:Z */
return;
} // .end method
public void a ( Integer p0, Boolean p1 ) {
/* .locals 4 */
int v3 = 4; // const/4 v3, 0x4
int v2 = 1; // const/4 v2, 0x1
int v1 = 0; // const/4 v1, 0x0
/* packed-switch p1, :pswitch_data_0 */
} // :cond_0
} // :goto_0
v0 = (( net.chobin.android.psdxylz.app.ap ) p0 ).a ( ); // invoke-virtual {p0}, Lnet/chobin/android/psdxylz/app/ap;->a()I
/* iput v0, p0, Lnet/chobin/android/psdxylz/app/ap;->a:I */
v0 = this.a;
v0 = this.a;
(( net.chobin.android.psdxylz.app.k ) v0 ).c ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/k;->c()V
/* iput-boolean v1, p0, Lnet/chobin/android/psdxylz/app/ap;->b:Z */
return;
/* :pswitch_0 */
/* if-nez p2, :cond_1 */
v0 = this.a;
v0 = (( net.chobin.android.psdxylz.app.a ) v0 ).getRequestedOrientation ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/a;->getRequestedOrientation()I
/* if-eq v0, v3, :cond_0 */
} // :cond_1
v0 = this.a;
(( net.chobin.android.psdxylz.app.a ) v0 ).setRequestedOrientation ( v3 ); // invoke-virtual {v0, v3}, Lnet/chobin/android/psdxylz/app/a;->setRequestedOrientation(I)V
/* :pswitch_1 */
/* if-nez p2, :cond_2 */
v0 = this.a;
v0 = (( net.chobin.android.psdxylz.app.a ) v0 ).getRequestedOrientation ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/a;->getRequestedOrientation()I
/* if-eq v0, v2, :cond_0 */
} // :cond_2
v0 = this.a;
(( net.chobin.android.psdxylz.app.a ) v0 ).setRequestedOrientation ( v2 ); // invoke-virtual {v0, v2}, Lnet/chobin/android/psdxylz/app/a;->setRequestedOrientation(I)V
/* :pswitch_2 */
/* if-nez p2, :cond_3 */
v0 = this.a;
v0 = (( net.chobin.android.psdxylz.app.a ) v0 ).getRequestedOrientation ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/a;->getRequestedOrientation()I
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_3
v0 = this.a;
(( net.chobin.android.psdxylz.app.a ) v0 ).setRequestedOrientation ( v1 ); // invoke-virtual {v0, v1}, Lnet/chobin/android/psdxylz/app/a;->setRequestedOrientation(I)V
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public void a ( Object p0 ) {
/* .locals 0 */
this.a = p1;
return;
} // .end method
public void a ( Boolean p0, Boolean p1 ) {
/* .locals 2 */
/* const/16 v1, 0x400 */
/* iget-boolean v0, p0, Lnet/chobin/android/psdxylz/app/ap;->a:Z */
/* if-ne v0, p1, :cond_0 */
if ( p2 != null) { // if-eqz p2, :cond_1
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_2
v0 = this.a;
(( net.chobin.android.psdxylz.app.a ) v0 ).getWindow ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/a;->getWindow()Landroid/view/Window;
(( android.view.Window ) v0 ).addFlags ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V
} // :cond_1
} // :goto_0
/* iput-boolean p1, p0, Lnet/chobin/android/psdxylz/app/ap;->a:Z */
v0 = this.a;
v0 = this.a;
(( net.chobin.android.psdxylz.app.k ) v0 ).c ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/k;->c()V
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lnet/chobin/android/psdxylz/app/ap;->b:Z */
return;
} // :cond_2
v0 = this.a;
(( net.chobin.android.psdxylz.app.a ) v0 ).getWindow ( ); // invoke-virtual {v0}, Lnet/chobin/android/psdxylz/app/a;->getWindow()Landroid/view/Window;
(( android.view.Window ) v0 ).clearFlags ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V
} // .end method
public Boolean a ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lnet/chobin/android/psdxylz/app/ap;->b:Z */
} // .end method
