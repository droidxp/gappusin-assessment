public class com.zhuoqiu.goodgx.Vapp extends android.app.Activity {
	 /* .source "Vapp.java" */
	 /* # static fields */
	 static final Boolean ADSENSE;
	 /* # instance fields */
	 com.zhuoqiu.goodgx.Vviews m_view;
	 /* # direct methods */
	 public com.zhuoqiu.goodgx.Vapp ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 46 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 2 */
		 /* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
		 /* .prologue */
		 /* const/16 v1, 0x400 */
		 /* .line 57 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 /* .line 60 */
		 int v0 = 1; // const/4 v0, 0x1
		 (( com.zhuoqiu.goodgx.Vapp ) p0 ).requestWindowFeature ( v0 ); // invoke-virtual {p0, v0}, Lcom/zhuoqiu/goodgx/Vapp;->requestWindowFeature(I)Z
		 /* .line 63 */
		 (( com.zhuoqiu.goodgx.Vapp ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/zhuoqiu/goodgx/Vapp;->getWindow()Landroid/view/Window;
		 (( android.view.Window ) v0 ).setFlags ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V
		 /* .line 67 */
		 /* new-instance v0, Lcom/zhuoqiu/goodgx/Vviews; */
		 final String v1 = "app.Pool"; // const-string v1, "app.Pool"
		 /* invoke-direct {v0, p0, v1}, Lcom/zhuoqiu/goodgx/Vviews;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
		 this.m_view = v0;
		 /* .line 69 */
		 v0 = this.m_view;
		 (( com.zhuoqiu.goodgx.Vapp ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/zhuoqiu/goodgx/Vapp;->setContentView(Landroid/view/View;)V
		 /* .line 112 */
		 return;
	 } // .end method
	 protected void onDestroy ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 115 */
		 v0 = this.m_view;
		 (( com.zhuoqiu.goodgx.Vviews ) v0 ).stop ( ); // invoke-virtual {v0}, Lcom/zhuoqiu/goodgx/Vviews;->stop()V
		 /* .line 116 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
		 /* .line 117 */
		 return;
	 } // .end method
	 public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
		 /* .locals 1 */
		 /* .param p1, "key" # I */
		 /* .param p2, "e" # Landroid/view/KeyEvent; */
		 /* .prologue */
		 /* .line 122 */
		 v0 = this.m_view;
		 v0 = 		 (( com.zhuoqiu.goodgx.Vviews ) v0 ).onKeyDown ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/zhuoqiu/goodgx/Vviews;->onKeyDown(ILandroid/view/KeyEvent;)Z
	 } // .end method
	 public Boolean onKeyUp ( Integer p0, android.view.KeyEvent p1 ) {
		 /* .locals 1 */
		 /* .param p1, "key" # I */
		 /* .param p2, "e" # Landroid/view/KeyEvent; */
		 /* .prologue */
		 /* .line 126 */
		 v0 = this.m_view;
		 v0 = 		 (( com.zhuoqiu.goodgx.Vviews ) v0 ).onKeyUp ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/zhuoqiu/goodgx/Vviews;->onKeyUp(ILandroid/view/KeyEvent;)Z
	 } // .end method
	 protected void onPause ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 130 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
		 /* .line 131 */
		 v0 = this.m_view;
		 int v1 = 1; // const/4 v1, 0x1
		 (( com.zhuoqiu.goodgx.Vviews ) v0 ).pause ( v1 ); // invoke-virtual {v0, v1}, Lcom/zhuoqiu/goodgx/Vviews;->pause(Z)V
		 /* .line 132 */
		 return;
	 } // .end method
	 protected void onResume ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 135 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
		 /* .line 136 */
		 v0 = this.m_view;
		 int v1 = 0; // const/4 v1, 0x0
		 (( com.zhuoqiu.goodgx.Vviews ) v0 ).pause ( v1 ); // invoke-virtual {v0, v1}, Lcom/zhuoqiu/goodgx/Vviews;->pause(Z)V
		 /* .line 137 */
		 return;
	 } // .end method
