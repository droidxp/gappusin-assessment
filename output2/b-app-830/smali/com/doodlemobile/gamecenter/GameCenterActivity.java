public class com.doodlemobile.gamecenter.GameCenterActivity extends android.app.Activity {
	 /* # instance fields */
	 com.doodlemobile.gamecenter.y a;
	 com.doodlemobile.gamecenter.bz b;
	 com.doodlemobile.gamecenter.ay c;
	 public com.a.a.g d;
	 public com.a.a.k e;
	 android.widget.TextView f;
	 java.lang.String g;
	 private android.widget.RelativeLayout h;
	 private com.doodlemobile.gamecenter.aa i;
	 private com.doodlemobile.gamecenter.bk j;
	 private com.doodlemobile.gamecenter.ca k;
	 private android.widget.RelativeLayout l;
	 private android.widget.RelativeLayout m;
	 private android.widget.RelativeLayout n;
	 private android.os.Handler o;
	 private android.widget.Button p;
	 private java.util.Stack q;
	 /* # direct methods */
	 public com.doodlemobile.gamecenter.GameCenterActivity ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 this.h = v2;
		 /* new-instance v0, Lcom/a/a/g; */
		 final String v1 = "144524028929909"; // const-string v1, "144524028929909"
		 /* invoke-direct {v0, v1}, Lcom/a/a/g;-><init>(Ljava/lang/String;)V */
		 this.d = v0;
		 this.l = v2;
		 this.m = v2;
		 this.n = v2;
		 /* new-instance v0, Landroid/os/Handler; */
		 /* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
		 this.o = v0;
		 this.f = v2;
		 int v0 = 7; // const/4 v0, 0x7
		 /* new-array v0, v0, [Ljava/lang/String; */
		 int v1 = 0; // const/4 v1, 0x0
		 final String v2 = "offline_access"; // const-string v2, "offline_access"
		 /* aput-object v2, v0, v1 */
		 int v1 = 1; // const/4 v1, 0x1
		 final String v2 = "read_stream"; // const-string v2, "read_stream"
		 /* aput-object v2, v0, v1 */
		 int v1 = 2; // const/4 v1, 0x2
		 final String v2 = "publish_stream"; // const-string v2, "publish_stream"
		 /* aput-object v2, v0, v1 */
		 int v1 = 3; // const/4 v1, 0x3
		 final String v2 = "user_photos"; // const-string v2, "user_photos"
		 /* aput-object v2, v0, v1 */
		 int v1 = 4; // const/4 v1, 0x4
		 final String v2 = "friends_education_history"; // const-string v2, "friends_education_history"
		 /* aput-object v2, v0, v1 */
		 int v1 = 5; // const/4 v1, 0x5
		 final String v2 = "friends_photos"; // const-string v2, "friends_photos"
		 /* aput-object v2, v0, v1 */
		 int v1 = 6; // const/4 v1, 0x6
		 final String v2 = "create_event"; // const-string v2, "create_event"
		 /* aput-object v2, v0, v1 */
		 this.g = v0;
		 /* new-instance v0, Ljava/util/Stack; */
		 /* invoke-direct {v0}, Ljava/util/Stack;-><init>()V */
		 this.q = v0;
		 return;
	 } // .end method
	 private void a ( android.content.Intent p0 ) {
		 /* .locals 4 */
		 int v2 = 2; // const/4 v2, 0x2
		 final String v3 = "classname"; // const-string v3, "classname"
		 (( android.content.Intent ) p1 ).getExtras ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
		 final String v1 = "classname"; // const-string v1, "classname"
		 v0 = 		 (( android.os.Bundle ) v0 ).containsKey ( v3 ); // invoke-virtual {v0, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 (( android.content.Intent ) p1 ).getExtras ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
			 final String v1 = "classname"; // const-string v1, "classname"
			 (( android.os.Bundle ) v0 ).getString ( v3 ); // invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
			 final String v1 = "com.doodlemobile.gamecenter.LeaderBoardActivity"; // const-string v1, "com.doodlemobile.gamecenter.LeaderBoardActivity"
			 v1 = 			 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 int v0 = 1; // const/4 v0, 0x1
				 (( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->a(I)V
			 } // :goto_0
			 return;
		 } // :cond_0
		 final String v1 = "com.doodlemobile.gamecenter.ProfileActivity"; // const-string v1, "com.doodlemobile.gamecenter.ProfileActivity"
		 v1 = 		 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 /* if-nez v1, :cond_1 */
		 final String v1 = "com.doodlemobile.gamecenter.FriendsActivity"; // const-string v1, "com.doodlemobile.gamecenter.FriendsActivity"
		 v0 = 		 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 int v0 = 3; // const/4 v0, 0x3
			 (( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->a(I)V
		 } // :cond_1
		 (( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->a(I)V
	 } // :cond_2
	 (( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->a(I)V
} // .end method
/* # virtual methods */
public final void a ( Integer p0 ) {
	 /* .locals 8 */
	 int v2 = 1; // const/4 v2, 0x1
	 int v7 = 0; // const/4 v7, 0x0
	 final String v6 = "dm_tab_unselected"; // const-string v6, "dm_tab_unselected"
	 final String v5 = "dm_tab_press"; // const-string v5, "dm_tab_press"
	 final String v4 = "drawable"; // const-string v4, "drawable"
	 /* if-ne v2, p1, :cond_2 */
	 v0 = this.i;
	 /* if-nez v0, :cond_0 */
	 /* new-instance v0, Lcom/doodlemobile/gamecenter/aa; */
	 /* invoke-direct {v0, p0}, Lcom/doodlemobile/gamecenter/aa;-><init>(Lcom/doodlemobile/gamecenter/GameCenterActivity;)V */
	 this.i = v0;
} // :cond_0
v0 = this.h;
(( android.widget.RelativeLayout ) v0 ).removeAllViews ( ); // invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V
v0 = this.h;
v1 = this.i;
(( android.widget.RelativeLayout ) v0 ).addView ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
v0 = this.i;
(( com.doodlemobile.gamecenter.aa ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/gamecenter/aa;->a()V
v0 = this.i;
this.k = v0;
} // :cond_1
} // :goto_0
/* move v1, v7 */
} // :goto_1
v0 = this.q;
v0 = (( java.util.Stack ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Stack;->size()I
/* if-ge v1, v0, :cond_a */
v0 = this.q;
(( java.util.Stack ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Stack;->get(I)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Integer; */
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* if-ne v0, p1, :cond_9 */
v0 = this.q;
(( java.util.Stack ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Stack;->remove(I)Ljava/lang/Object;
v0 = this.q;
java.lang.Integer .valueOf ( p1 );
(( java.util.Stack ) v0 ).push ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;
} // :goto_2
v0 = this.k;
v1 = this.i;
/* if-ne v0, v1, :cond_b */
v0 = this.l;
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->getBaseContext()Landroid/content/Context;
com.doodlemobile.gamecenter.cm .a ( v1 );
v1 = this.a;
final String v2 = "drawable"; // const-string v2, "drawable"
final String v2 = "dm_tab_press"; // const-string v2, "dm_tab_press"
v1 = com.doodlemobile.gamecenter.cd .a ( v1,v4,v5 );
(( android.widget.RelativeLayout ) v0 ).setBackgroundResource ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V
} // :goto_3
v0 = this.k;
v1 = this.a;
/* if-ne v0, v1, :cond_c */
v0 = this.m;
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->getBaseContext()Landroid/content/Context;
com.doodlemobile.gamecenter.cm .a ( v1 );
v1 = this.a;
final String v2 = "drawable"; // const-string v2, "drawable"
final String v2 = "dm_tab_press"; // const-string v2, "dm_tab_press"
v1 = com.doodlemobile.gamecenter.cd .a ( v1,v4,v5 );
(( android.widget.RelativeLayout ) v0 ).setBackgroundResource ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V
} // :goto_4
v0 = this.k;
v1 = this.b;
/* if-ne v0, v1, :cond_d */
v0 = this.n;
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->getBaseContext()Landroid/content/Context;
com.doodlemobile.gamecenter.cm .a ( v1 );
v1 = this.a;
final String v2 = "drawable"; // const-string v2, "drawable"
final String v2 = "dm_tab_press"; // const-string v2, "dm_tab_press"
v1 = com.doodlemobile.gamecenter.cd .a ( v1,v4,v5 );
(( android.widget.RelativeLayout ) v0 ).setBackgroundResource ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V
} // :goto_5
return;
} // :cond_2
int v0 = 2; // const/4 v0, 0x2
/* if-ne v0, p1, :cond_4 */
v0 = this.a;
/* if-nez v0, :cond_3 */
/* new-instance v0, Lcom/doodlemobile/gamecenter/y; */
/* invoke-direct {v0, p0}, Lcom/doodlemobile/gamecenter/y;-><init>(Lcom/doodlemobile/gamecenter/GameCenterActivity;)V */
this.a = v0;
} // :cond_3
v0 = this.h;
(( android.widget.RelativeLayout ) v0 ).removeAllViews ( ); // invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V
v0 = this.h;
v1 = this.a;
(( android.widget.RelativeLayout ) v0 ).addView ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
v0 = this.a;
(( com.doodlemobile.gamecenter.y ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/gamecenter/y;->a()V
v0 = this.a;
this.k = v0;
/* goto/16 :goto_0 */
} // :cond_4
int v0 = 3; // const/4 v0, 0x3
/* if-ne v0, p1, :cond_6 */
v0 = this.b;
/* if-nez v0, :cond_5 */
/* new-instance v0, Lcom/doodlemobile/gamecenter/bz; */
/* invoke-direct {v0, p0}, Lcom/doodlemobile/gamecenter/bz;-><init>(Lcom/doodlemobile/gamecenter/GameCenterActivity;)V */
this.b = v0;
} // :cond_5
v0 = this.h;
(( android.widget.RelativeLayout ) v0 ).removeAllViews ( ); // invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V
v0 = this.h;
v1 = this.b;
(( android.widget.RelativeLayout ) v0 ).addView ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
v0 = this.b;
(( com.doodlemobile.gamecenter.bz ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/gamecenter/bz;->a()V
v0 = this.b;
this.k = v0;
/* goto/16 :goto_0 */
} // :cond_6
int v0 = 4; // const/4 v0, 0x4
/* if-ne v0, p1, :cond_8 */
v0 = this.h;
(( android.widget.RelativeLayout ) v0 ).removeAllViews ( ); // invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V
v0 = this.h;
v1 = this.c;
(( android.widget.RelativeLayout ) v0 ).addView ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
v0 = this.c;
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_7
/* iget-boolean v1, v0, Lcom/doodlemobile/gamecenter/ay;->b:Z */
/* if-nez v1, :cond_7 */
/* new-instance v1, Lcom/doodlemobile/gamecenter/bf; */
/* invoke-direct {v1, v0}, Lcom/doodlemobile/gamecenter/bf;-><init>(Lcom/doodlemobile/gamecenter/ay;)V */
/* new-array v2, v2, [Ljava/lang/String; */
v3 = this.a;
/* aput-object v3, v2, v7 */
(( com.doodlemobile.gamecenter.bf ) v1 ).execute ( v2 ); // invoke-virtual {v1, v2}, Lcom/doodlemobile/gamecenter/bf;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
} // :cond_7
(( com.doodlemobile.gamecenter.ca ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodlemobile/gamecenter/ca;->b()V
v0 = this.c;
this.k = v0;
/* goto/16 :goto_0 */
} // :cond_8
int v0 = 5; // const/4 v0, 0x5
/* if-ne v0, p1, :cond_1 */
v0 = this.h;
(( android.widget.RelativeLayout ) v0 ).removeAllViews ( ); // invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V
v0 = this.h;
v1 = this.j;
(( android.widget.RelativeLayout ) v0 ).addView ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
v0 = this.j;
this.k = v0;
/* goto/16 :goto_0 */
} // :cond_9
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
/* goto/16 :goto_1 */
} // :cond_a
v0 = this.q;
java.lang.Integer .valueOf ( p1 );
(( java.util.Stack ) v0 ).push ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;
/* goto/16 :goto_2 */
} // :cond_b
v0 = this.l;
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->getBaseContext()Landroid/content/Context;
com.doodlemobile.gamecenter.cm .a ( v1 );
v1 = this.a;
final String v2 = "drawable"; // const-string v2, "drawable"
final String v2 = "dm_tab_unselected"; // const-string v2, "dm_tab_unselected"
v1 = com.doodlemobile.gamecenter.cd .a ( v1,v4,v6 );
(( android.widget.RelativeLayout ) v0 ).setBackgroundResource ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V
/* goto/16 :goto_3 */
} // :cond_c
v0 = this.m;
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->getBaseContext()Landroid/content/Context;
com.doodlemobile.gamecenter.cm .a ( v1 );
v1 = this.a;
final String v2 = "drawable"; // const-string v2, "drawable"
final String v2 = "dm_tab_unselected"; // const-string v2, "dm_tab_unselected"
v1 = com.doodlemobile.gamecenter.cd .a ( v1,v4,v6 );
(( android.widget.RelativeLayout ) v0 ).setBackgroundResource ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V
/* goto/16 :goto_4 */
} // :cond_d
v0 = this.n;
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->getBaseContext()Landroid/content/Context;
com.doodlemobile.gamecenter.cm .a ( v1 );
v1 = this.a;
final String v2 = "drawable"; // const-string v2, "drawable"
final String v2 = "dm_tab_unselected"; // const-string v2, "dm_tab_unselected"
v1 = com.doodlemobile.gamecenter.cd .a ( v1,v4,v6 );
(( android.widget.RelativeLayout ) v0 ).setBackgroundResource ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V
/* goto/16 :goto_5 */
} // .end method
public final Boolean a ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
v0 = this.q;
v0 = (( java.util.Stack ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Stack;->size()I
/* if-lez v0, :cond_1 */
v0 = this.q;
(( java.util.Stack ) v0 ).pop ( ); // invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;
v0 = this.q;
v0 = (( java.util.Stack ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Stack;->size()I
/* if-nez v0, :cond_0 */
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->finish()V
/* move v0, v1 */
} // :goto_0
} // :cond_0
v0 = this.q;
(( java.util.Stack ) v0 ).peek ( ); // invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Integer; */
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->a(I)V
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->finish()V
/* move v0, v1 */
} // .end method
protected void onActivityResult ( Integer p0, Integer p1, android.content.Intent p2 ) {
/* .locals 7 */
/* const/16 v6, 0x2713 */
/* const/16 v5, 0x48 */
int v3 = 1; // const/4 v3, 0x1
final String v4 = "data"; // const-string v4, "data"
/* invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V */
v0 = this.d;
(( com.a.a.g ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lcom/a/a/g;->a(IILandroid/content/Intent;)V
int v0 = -1; // const/4 v0, -0x1
/* if-ne p2, v0, :cond_0 */
/* if-ne p1, v6, :cond_2 */
if ( p3 != null) { // if-eqz p3, :cond_0
final String v0 = "data"; // const-string v0, "data"
(( android.content.Intent ) p3 ).getParcelableExtra ( v4 ); // invoke-virtual {p3, v4}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
/* if-nez v0, :cond_1 */
} // :cond_0
} // :goto_0
return;
} // :cond_1
v0 = this.a;
(( com.doodlemobile.gamecenter.y ) v0 ).a ( p3 ); // invoke-virtual {v0, p3}, Lcom/doodlemobile/gamecenter/y;->a(Landroid/content/Intent;)V
} // :cond_2
/* const/16 v0, 0x2714 */
/* if-ne p1, v0, :cond_0 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "com.android.camera.action.CROP"; // const-string v1, "com.android.camera.action.CROP"
(( android.content.Intent ) p3 ).getData ( ); // invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;
/* invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
final String v1 = "image/*"; // const-string v1, "image/*"
(( android.content.Intent ) v0 ).setType ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
final String v1 = "crop"; // const-string v1, "crop"
final String v2 = "true"; // const-string v2, "true"
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
final String v1 = "aspectX"; // const-string v1, "aspectX"
(( android.content.Intent ) v0 ).putExtra ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
final String v1 = "aspectY"; // const-string v1, "aspectY"
(( android.content.Intent ) v0 ).putExtra ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
final String v1 = "outputX"; // const-string v1, "outputX"
(( android.content.Intent ) v0 ).putExtra ( v1, v5 ); // invoke-virtual {v0, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
final String v1 = "outputY"; // const-string v1, "outputY"
(( android.content.Intent ) v0 ).putExtra ( v1, v5 ); // invoke-virtual {v0, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
final String v1 = "return-data"; // const-string v1, "return-data"
(( android.content.Intent ) v0 ).putExtra ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
final String v1 = "data"; // const-string v1, "data"
final String v1 = "data"; // const-string v1, "data"
(( android.content.Intent ) p3 ).getParcelableExtra ( v4 ); // invoke-virtual {p3, v4}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
(( android.content.Intent ) v0 ).putExtra ( v4, v1 ); // invoke-virtual {v0, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).startActivityForResult ( v0, v6 ); // invoke-virtual {p0, v0, v6}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->startActivityForResult(Landroid/content/Intent;I)V
} // .end method
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 6 */
final String v5 = "id"; // const-string v5, "id"
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->getBaseContext()Landroid/content/Context;
com.doodlemobile.gamecenter.cm .a ( v0 );
v0 = this.a;
final String v3 = "layout"; // const-string v3, "layout"
final String v4 = "dm_gamecenter_activity"; // const-string v4, "dm_gamecenter_activity"
v0 = com.doodlemobile.gamecenter.cd .a ( v0,v3,v4 );
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->setContentView(I)V
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->getBaseContext()Landroid/content/Context;
com.doodlemobile.gamecenter.cm .a ( v0 );
v0 = this.a;
final String v3 = "id"; // const-string v3, "id"
final String v3 = "center"; // const-string v3, "center"
v0 = com.doodlemobile.gamecenter.cd .a ( v0,v5,v3 );
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/RelativeLayout; */
this.h = v0;
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->getBaseContext()Landroid/content/Context;
com.doodlemobile.gamecenter.cm .a ( v0 );
v0 = this.a;
final String v3 = "id"; // const-string v3, "id"
final String v3 = "leaderboards"; // const-string v3, "leaderboards"
v0 = com.doodlemobile.gamecenter.cd .a ( v0,v5,v3 );
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/RelativeLayout; */
this.l = v0;
v0 = this.l;
/* new-instance v3, Lcom/doodlemobile/gamecenter/ai; */
/* invoke-direct {v3, p0}, Lcom/doodlemobile/gamecenter/ai;-><init>(Lcom/doodlemobile/gamecenter/GameCenterActivity;)V */
(( android.widget.RelativeLayout ) v0 ).setOnClickListener ( v3 ); // invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->getBaseContext()Landroid/content/Context;
com.doodlemobile.gamecenter.cm .a ( v0 );
v0 = this.a;
final String v3 = "id"; // const-string v3, "id"
final String v3 = "profile"; // const-string v3, "profile"
v0 = com.doodlemobile.gamecenter.cd .a ( v0,v5,v3 );
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/RelativeLayout; */
this.m = v0;
v0 = this.m;
/* new-instance v3, Lcom/doodlemobile/gamecenter/aj; */
/* invoke-direct {v3, p0}, Lcom/doodlemobile/gamecenter/aj;-><init>(Lcom/doodlemobile/gamecenter/GameCenterActivity;)V */
(( android.widget.RelativeLayout ) v0 ).setOnClickListener ( v3 ); // invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->getBaseContext()Landroid/content/Context;
com.doodlemobile.gamecenter.cm .a ( v0 );
v0 = this.a;
final String v3 = "id"; // const-string v3, "id"
final String v3 = "title"; // const-string v3, "title"
v0 = com.doodlemobile.gamecenter.cd .a ( v0,v5,v3 );
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/TextView; */
this.f = v0;
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->getBaseContext()Landroid/content/Context;
com.doodlemobile.gamecenter.cm .a ( v0 );
v0 = this.a;
final String v3 = "id"; // const-string v3, "id"
final String v3 = "friends"; // const-string v3, "friends"
v0 = com.doodlemobile.gamecenter.cd .a ( v0,v5,v3 );
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/RelativeLayout; */
this.n = v0;
v0 = this.n;
/* new-instance v3, Lcom/doodlemobile/gamecenter/ak; */
/* invoke-direct {v3, p0}, Lcom/doodlemobile/gamecenter/ak;-><init>(Lcom/doodlemobile/gamecenter/GameCenterActivity;)V */
(( android.widget.RelativeLayout ) v0 ).setOnClickListener ( v3 ); // invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->getIntent()Landroid/content/Intent;
/* invoke-direct {p0, v0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->a(Landroid/content/Intent;)V */
/* new-instance v0, Lcom/doodlemobile/gamecenter/ay; */
/* invoke-direct {v0, p0}, Lcom/doodlemobile/gamecenter/ay;-><init>(Lcom/doodlemobile/gamecenter/GameCenterActivity;)V */
this.c = v0;
/* new-instance v0, Lcom/doodlemobile/gamecenter/bk; */
/* invoke-direct {v0, p0}, Lcom/doodlemobile/gamecenter/bk;-><init>(Lcom/doodlemobile/gamecenter/GameCenterActivity;)V */
this.j = v0;
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->getBaseContext()Landroid/content/Context;
com.doodlemobile.gamecenter.cm .a ( v0 );
v0 = this.a;
final String v3 = "id"; // const-string v3, "id"
final String v3 = "back"; // const-string v3, "back"
v0 = com.doodlemobile.gamecenter.cd .a ( v0,v5,v3 );
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/Button; */
this.p = v0;
v0 = this.p;
/* new-instance v3, Lcom/doodlemobile/gamecenter/al; */
/* invoke-direct {v3, p0}, Lcom/doodlemobile/gamecenter/al;-><init>(Lcom/doodlemobile/gamecenter/GameCenterActivity;)V */
(( android.widget.Button ) v0 ).setOnClickListener ( v3 ); // invoke-virtual {v0, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
final String v0 = "GameCenterActivity"; // const-string v0, "GameCenterActivity"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "on create duration: "; // const-string v4, "on create duration: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.System .currentTimeMillis ( );
/* move-result-wide v4 */
/* sub-long v1, v4, v1 */
(( java.lang.StringBuilder ) v3 ).append ( v1, v2 ); // invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v0,v1 );
return;
} // .end method
protected android.app.Dialog onCreateDialog ( Integer p0 ) {
/* .locals 1 */
/* const v0, 0x186a1 */
/* if-ne v0, p1, :cond_0 */
v0 = this.a;
(( com.doodlemobile.gamecenter.y ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodlemobile/gamecenter/y;->c()Landroid/app/Dialog;
} // :goto_0
} // :cond_0
/* const v0, 0x186a2 */
/* if-ne v0, p1, :cond_1 */
v0 = this.a;
(( com.doodlemobile.gamecenter.y ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodlemobile/gamecenter/y;->d()Landroid/app/Dialog;
} // :cond_1
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreateDialog(I)Landroid/app/Dialog; */
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_1 */
v0 = (( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->a()Z
/* if-nez v0, :cond_0 */
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
protected void onNewIntent ( android.content.Intent p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V */
(( com.doodlemobile.gamecenter.GameCenterActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->getIntent()Landroid/content/Intent;
/* invoke-direct {p0, v0}, Lcom/doodlemobile/gamecenter/GameCenterActivity;->a(Landroid/content/Intent;)V */
return;
} // .end method
protected void onPrepareDialog ( Integer p0, android.app.Dialog p1 ) {
/* .locals 1 */
/* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPrepareDialog(ILandroid/app/Dialog;)V */
/* const v0, 0x186a1 */
/* if-ne v0, p1, :cond_1 */
v0 = this.a;
(( com.doodlemobile.gamecenter.y ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/doodlemobile/gamecenter/y;->c()Landroid/app/Dialog;
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* const v0, 0x186a2 */
/* if-ne v0, p1, :cond_0 */
v0 = this.a;
(( com.doodlemobile.gamecenter.y ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/doodlemobile/gamecenter/y;->d()Landroid/app/Dialog;
} // .end method
