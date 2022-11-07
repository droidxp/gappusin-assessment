public class com.funbox.game.ang.ScoreList extends android.app.Activity {
	 /* .source "ScoreList.java" */
	 /* # instance fields */
	 private final java.lang.String PREFS_NAME;
	 private final mImgOrder;
	 private android.widget.ListView mList;
	 private mScoreArray;
	 private android.view.Window window;
	 /* # direct methods */
	 public com.funbox.game.ang.ScoreList ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 /* .line 23 */
		 v0 = com.funbox.game.ang.GMenu.PREFS_NAME;
		 this.PREFS_NAME = v0;
		 /* .line 25 */
		 /* const/16 v0, 0x9 */
		 /* new-array v0, v0, [I */
		 /* fill-array-data v0, :array_0 */
		 /* .line 34 */
		 this.mImgOrder = v0;
		 /* .line 35 */
		 /* const/16 v0, 0xa */
		 /* new-array v0, v0, [I */
		 this.mScoreArray = v0;
		 /* .line 22 */
		 return;
		 /* .line 25 */
		 /* nop */
		 /* :array_0 */
		 /* .array-data 4 */
		 /* 0x7f020034 */
		 /* 0x7f020035 */
		 /* 0x7f020036 */
		 /* 0x7f020037 */
		 /* 0x7f020038 */
		 /* 0x7f020039 */
		 /* 0x7f02003a */
		 /* 0x7f02003b */
		 /* 0x7f02003c */
	 } // .end array-data
} // .end method
private void loadHightScore ( ) {
	 /* .locals 6 */
	 /* .prologue */
	 int v5 = 0; // const/4 v5, 0x0
	 /* .line 110 */
	 v2 = this.PREFS_NAME;
	 (( com.funbox.game.ang.ScoreList ) p0 ).getSharedPreferences ( v2, v5 ); // invoke-virtual {p0, v2, v5}, Lcom/funbox/game/ang/ScoreList;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 /* .line 111 */
	 /* .local v1, "settings":Landroid/content/SharedPreferences; */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .local v0, "i":I */
} // :goto_0
/* const/16 v2, 0x9 */
/* if-lt v0, v2, :cond_0 */
/* .line 114 */
return;
/* .line 112 */
} // :cond_0
v2 = this.mScoreArray;
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "highScore"; // const-string v4, "highScore"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
java.lang.Integer .toString ( v0 );
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* aput v3, v2, v0 */
/* .line 111 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
/* # virtual methods */
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 14 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
/* const/16 v3, 0x400 */
int v12 = 2; // const/4 v12, 0x2
int v10 = 1; // const/4 v10, 0x1
final String v13 = "img"; // const-string v13, "img"
final String v11 = "name"; // const-string v11, "name"
/* .line 43 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
com.games.a .a ( p0 );
/* .line 46 */
(( com.funbox.game.ang.ScoreList ) p0 ).requestWindowFeature ( v10 ); // invoke-virtual {p0, v10}, Lcom/funbox/game/ang/ScoreList;->requestWindowFeature(I)Z
/* .line 47 */
(( com.funbox.game.ang.ScoreList ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/ScoreList;->getWindow()Landroid/view/Window;
this.window = v1;
/* .line 48 */
v1 = this.window;
(( android.view.Window ) v1 ).setFlags ( v3, v3 ); // invoke-virtual {v1, v3, v3}, Landroid/view/Window;->setFlags(II)V
/* .line 53 */
/* const v1, 0x7f030001 */
(( com.funbox.game.ang.ScoreList ) p0 ).setContentView ( v1 ); // invoke-virtual {p0, v1}, Lcom/funbox/game/ang/ScoreList;->setContentView(I)V
/* .line 54 */
final String v1 = "High Score"; // const-string v1, "High Score"
(( com.funbox.game.ang.ScoreList ) p0 ).setTitle ( v1 ); // invoke-virtual {p0, v1}, Lcom/funbox/game/ang/ScoreList;->setTitle(Ljava/lang/CharSequence;)V
/* .line 56 */
/* invoke-direct {p0}, Lcom/funbox/game/ang/ScoreList;->loadHightScore()V */
/* .line 58 */
/* new-instance v2, Ljava/util/ArrayList; */
/* invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V */
/* .line 60 */
/* .local v2, "users":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;" */
int v7 = 0; // const/4 v7, 0x0
/* .local v7, "i":I */
} // :goto_0
/* const/16 v1, 0x9 */
/* if-lt v7, v1, :cond_0 */
/* .line 74 */
final String v1 = "main"; // const-string v1, "main"
final String v3 = "users.add"; // const-string v3, "users.add"
android.util.Log .v ( v1,v3 );
/* .line 76 */
/* new-instance v0, Landroid/widget/SimpleAdapter; */
/* .line 78 */
/* const v3, 0x7f030002 */
/* .line 79 */
/* new-array v4, v12, [Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
final String v5 = "img"; // const-string v5, "img"
/* aput-object v13, v4, v1 */
final String v1 = "name"; // const-string v1, "name"
/* aput-object v11, v4, v10 */
/* .line 81 */
/* new-array v5, v12, [I */
/* fill-array-data v5, :array_0 */
/* move-object v1, p0 */
/* .line 76 */
/* invoke-direct/range {v0 ..v5}, Landroid/widget/SimpleAdapter;-><init>(Landroid/content/Context;Ljava/util/List;I[Ljava/lang/String;[I)V */
/* .line 83 */
/* .local v0, "saImageItems":Landroid/widget/SimpleAdapter; */
final String v1 = "main"; // const-string v1, "main"
final String v3 = "new SimpleAdapter"; // const-string v3, "new SimpleAdapter"
android.util.Log .v ( v1,v3 );
/* .line 86 */
/* const v1, 0x7f060005 */
(( com.funbox.game.ang.ScoreList ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/funbox/game/ang/ScoreList;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/ListView; */
this.mList = v1;
/* .line 87 */
v1 = this.mList;
(( android.widget.ListView ) v1 ).setAdapter ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
/* .line 88 */
v1 = this.mList;
(( android.widget.ListView ) v1 ).setItemsCanFocus ( v10 ); // invoke-virtual {v1, v10}, Landroid/widget/ListView;->setItemsCanFocus(Z)V
/* .line 92 */
v1 = this.mList;
/* new-instance v3, Lcom/funbox/game/ang/ScoreList$1; */
/* invoke-direct {v3, p0}, Lcom/funbox/game/ang/ScoreList$1;-><init>(Lcom/funbox/game/ang/ScoreList;)V */
(( android.widget.ListView ) v1 ).setOnItemClickListener ( v3 ); // invoke-virtual {v1, v3}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
/* .line 101 */
/* const v1, 0x7f060007 */
(( com.funbox.game.ang.ScoreList ) p0 ).findViewById ( v1 ); // invoke-virtual {p0, v1}, Lcom/funbox/game/ang/ScoreList;->findViewById(I)Landroid/view/View;
/* check-cast v6, Landroid/widget/Button; */
/* .line 102 */
/* .local v6, "btn":Landroid/widget/Button; */
/* new-instance v1, Lcom/funbox/game/ang/ScoreList$2; */
/* invoke-direct {v1, p0}, Lcom/funbox/game/ang/ScoreList$2;-><init>(Lcom/funbox/game/ang/ScoreList;)V */
(( android.widget.Button ) v6 ).setOnClickListener ( v1 ); // invoke-virtual {v6, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 107 */
return;
/* .line 62 */
} // .end local v0 # "saImageItems":Landroid/widget/SimpleAdapter;
} // .end local v6 # "btn":Landroid/widget/Button;
} // :cond_0
/* new-instance v9, Ljava/util/HashMap; */
/* invoke-direct {v9}, Ljava/util/HashMap;-><init>()V */
/* .line 64 */
/* .local v9, "user":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
v1 = this.mScoreArray;
/* aget v8, v1, v7 */
/* .line 65 */
/* .local v8, "score":I */
final String v1 = "img"; // const-string v1, "img"
v1 = this.mImgOrder;
/* aget v1, v1, v7 */
java.lang.Integer .valueOf ( v1 );
(( java.util.HashMap ) v9 ).put ( v13, v1 ); // invoke-virtual {v9, v13, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 67 */
/* if-nez v8, :cond_1 */
/* .line 68 */
final String v1 = "name"; // const-string v1, "name"
final String v1 = ""; // const-string v1, ""
(( java.util.HashMap ) v9 ).put ( v11, v1 ); // invoke-virtual {v9, v11, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 71 */
} // :goto_1
(( java.util.ArrayList ) v2 ).add ( v9 ); // invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 60 */
/* add-int/lit8 v7, v7, 0x1 */
/* .line 70 */
} // :cond_1
final String v1 = "name"; // const-string v1, "name"
java.lang.Integer .toString ( v8 );
(( java.util.HashMap ) v9 ).put ( v11, v1 ); // invoke-virtual {v9, v11, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 81 */
/* nop */
/* :array_0 */
/* .array-data 4 */
/* 0x7f060008 */
/* 0x7f060009 */
} // .end array-data
} // .end method
