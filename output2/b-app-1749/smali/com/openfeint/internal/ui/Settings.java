public class com.openfeint.internal.ui.Settings extends com.openfeint.internal.ui.WebNav {
	 /* .source "Settings.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/openfeint/internal/ui/Settings$SettingsActionHandler; */
	 /* } */
} // .end annotation
/* # instance fields */
java.lang.String mOldUserId;
/* # direct methods */
public com.openfeint.internal.ui.Settings ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 19 */
	 /* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebNav;-><init>()V */
	 return;
} // .end method
public static void open ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 /* .line 23 */
	 com.openfeint.internal.OpenFeintInternal .getInstance ( );
	 /* .line 24 */
	 /* .local v2, "ofi":Lcom/openfeint/internal/OpenFeintInternal; */
	 (( com.openfeint.internal.OpenFeintInternal ) v2 ).getContext ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
	 /* .line 25 */
	 /* .local v0, "currentActivity":Landroid/content/Context; */
	 /* new-instance v1, Landroid/content/Intent; */
	 /* const-class v3, Lcom/openfeint/internal/ui/Settings; */
	 /* invoke-direct {v1, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
	 /* .line 26 */
	 /* .local v1, "intent":Landroid/content/Intent; */
	 /* const/high16 v3, 0x10000000 */
	 (( android.content.Intent ) v1 ).addFlags ( v3 ); // invoke-virtual {v1, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
	 /* .line 27 */
	 (( android.content.Context ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
	 /* .line 28 */
	 return;
} // .end method
/* # virtual methods */
protected com.openfeint.internal.ui.WebNav$ActionHandler createActionHandler ( com.openfeint.internal.ui.WebNav p0 ) {
	 /* .locals 1 */
	 /* .param p1, "webNav" # Lcom/openfeint/internal/ui/WebNav; */
	 /* .prologue */
	 /* .line 55 */
	 /* new-instance v0, Lcom/openfeint/internal/ui/Settings$SettingsActionHandler; */
	 /* invoke-direct {v0, p0, p1}, Lcom/openfeint/internal/ui/Settings$SettingsActionHandler;-><init>(Lcom/openfeint/internal/ui/Settings;Lcom/openfeint/internal/ui/WebNav;)V */
} // .end method
protected java.lang.String initialContentPath ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 50 */
	 final String v0 = "settings/index"; // const-string v0, "settings/index"
} // .end method
protected void onActivityResult ( Integer p0, Integer p1, android.content.Intent p2 ) {
	 /* .locals 2 */
	 /* .param p1, "requestCode" # I */
	 /* .param p2, "resultCode" # I */
	 /* .param p3, "data" # Landroid/content/Intent; */
	 /* .prologue */
	 /* .line 60 */
	 /* invoke-super {p0, p1, p2, p3}, Lcom/openfeint/internal/ui/WebNav;->onActivityResult(IILandroid/content/Intent;)V */
	 /* .line 63 */
	 /* const/16 v0, 0x2719 */
	 /* if-ne p1, v0, :cond_0 */
	 if ( p3 != null) { // if-eqz p3, :cond_0
		 /* .line 64 */
		 com.openfeint.internal.OpenFeintInternal .getRString ( v0 );
		 int v1 = 0; // const/4 v1, 0x0
		 android.widget.Toast .makeText ( p0,v0,v1 );
		 (( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
		 /* .line 66 */
	 } // :cond_0
	 return;
} // .end method
public void onResume ( ) {
	 /* .locals 5 */
	 /* .prologue */
	 /* .line 31 */
	 v0 = this.mOldUserId;
	 /* if-nez v0, :cond_1 */
	 /* .line 32 */
	 com.openfeint.api.OpenFeint .getCurrentUser ( );
	 (( com.openfeint.api.resource.CurrentUser ) v0 ).resourceID ( ); // invoke-virtual {v0}, Lcom/openfeint/api/resource/CurrentUser;->resourceID()Ljava/lang/String;
	 this.mOldUserId = v0;
	 /* .line 45 */
} // :cond_0
} // :goto_0
/* invoke-super {p0}, Lcom/openfeint/internal/ui/WebNav;->onResume()V */
/* .line 46 */
return;
/* .line 33 */
} // :cond_1
v0 = this.mOldUserId;
com.openfeint.api.OpenFeint .getCurrentUser ( );
(( com.openfeint.api.resource.CurrentUser ) v1 ).resourceID ( ); // invoke-virtual {v1}, Lcom/openfeint/api/resource/CurrentUser;->resourceID()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
/* .line 34 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
com.openfeint.api.OpenFeint .getCurrentUser ( );
v4 = this.name;
/* aput-object v4, v2, v3 */
java.lang.String .format ( v1,v2 );
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
/* new-instance v2, Lcom/openfeint/internal/ui/Settings$1; */
/* invoke-direct {v2, p0}, Lcom/openfeint/internal/ui/Settings$1;-><init>(Lcom/openfeint/internal/ui/Settings;)V */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
} // .end method
