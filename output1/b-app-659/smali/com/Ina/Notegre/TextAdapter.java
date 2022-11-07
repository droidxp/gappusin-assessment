public class com.Ina.Notegre.TextAdapter extends android.widget.BaseAdapter {
	 /* .source "TextAdapter.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/Ina/Notegre/TextAdapter$ViewHolder; */
	 /* } */
} // .end annotation
/* # static fields */
public static java.util.List mListMap;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
private android.graphics.Bitmap mFolderIcon;
private android.graphics.Bitmap mIcon;
private android.view.LayoutInflater mInflater;
private android.graphics.Bitmap mRetruniIcon;
/* # direct methods */
public com.Ina.Notegre.TextAdapter ( ) {
/* .locals 2 */
/* .param p1, "context" # Landroid/content/Context; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;>;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 26 */
/* .local p2, "listMap":Ljava/util/List;, "Ljava/util/List<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;" */
/* invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V */
/* .line 28 */
android.view.LayoutInflater .from ( p1 );
this.mInflater = v0;
/* .line 29 */
/* .line 31 */
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* const v1, 0x7f020015 */
android.graphics.BitmapFactory .decodeResource ( v0,v1 );
this.mIcon = v0;
/* .line 32 */
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* const v1, 0x7f020009 */
android.graphics.BitmapFactory .decodeResource ( v0,v1 );
this.mFolderIcon = v0;
/* .line 33 */
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* const v1, 0x7f02000f */
android.graphics.BitmapFactory .decodeResource ( v0,v1 );
this.mRetruniIcon = v0;
/* .line 34 */
return;
} // .end method
/* # virtual methods */
public void clear ( ) {
/* .locals 1 */
/* .prologue */
/* .line 143 */
v0 = com.Ina.Notegre.TextAdapter.mListMap;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 144 */
v0 = v0 = com.Ina.Notegre.TextAdapter.mListMap;
/* if-lez v0, :cond_0 */
/* .line 145 */
v0 = com.Ina.Notegre.TextAdapter.mListMap;
/* .line 146 */
} // :cond_0
return;
} // .end method
public java.lang.String getContent ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "position" # I */
/* .prologue */
/* .line 101 */
v1 = com.Ina.Notegre.TextAdapter.mListMap;
/* check-cast v0, Ljava/util/HashMap; */
/* .line 102 */
/* .local v0, "hashMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v1 = "content"; // const-string v1, "content"
(( java.util.HashMap ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
} // .end method
public Integer getCount ( ) {
/* .locals 1 */
/* .prologue */
/* .line 39 */
v0 = v0 = com.Ina.Notegre.TextAdapter.mListMap;
} // .end method
public java.lang.String getFolderName ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "position" # I */
/* .prologue */
/* .line 136 */
v1 = com.Ina.Notegre.TextAdapter.mListMap;
/* check-cast v0, Ljava/util/HashMap; */
/* .line 138 */
/* .local v0, "hashMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v1 = "name"; // const-string v1, "name"
(( java.util.HashMap ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( java.lang.Object ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // .end method
public Integer getId ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "position" # I */
/* .prologue */
/* .line 107 */
v2 = com.Ina.Notegre.TextAdapter.mListMap;
/* check-cast v0, Ljava/util/HashMap; */
/* .line 108 */
/* .local v0, "hashMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v2 = "_id"; // const-string v2, "_id"
(( java.util.HashMap ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( java.lang.Object ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
v1 = java.lang.Integer .parseInt ( v2 );
/* .line 110 */
/* .local v1, "nId":I */
} // .end method
public java.lang.Object getItem ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "arg0" # I */
/* .prologue */
/* .line 45 */
v1 = com.Ina.Notegre.TextAdapter.mListMap;
/* check-cast v0, Ljava/util/HashMap; */
/* .line 46 */
/* .local v0, "hashMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v1 = "title"; // const-string v1, "title"
(( java.util.HashMap ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
public Long getItemId ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "arg0" # I */
/* .prologue */
/* .line 52 */
/* int-to-long v0, p1 */
/* return-wide v0 */
} // .end method
public java.lang.String getTime ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "position" # I */
/* .prologue */
/* .line 122 */
v1 = com.Ina.Notegre.TextAdapter.mListMap;
/* check-cast v0, Ljava/util/HashMap; */
/* .line 124 */
/* .local v0, "hashMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v1 = "time"; // const-string v1, "time"
(( java.util.HashMap ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( java.lang.Object ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // .end method
public java.lang.String getTitle ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "position" # I */
/* .prologue */
/* .line 115 */
v1 = com.Ina.Notegre.TextAdapter.mListMap;
/* check-cast v0, Ljava/util/HashMap; */
/* .line 117 */
/* .local v0, "hashMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v1 = "title"; // const-string v1, "title"
(( java.util.HashMap ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( java.lang.Object ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // .end method
public Integer getType ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "position" # I */
/* .prologue */
/* .line 129 */
v1 = com.Ina.Notegre.TextAdapter.mListMap;
/* check-cast v0, Ljava/util/HashMap; */
/* .line 131 */
/* .local v0, "hashMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v1 = "type"; // const-string v1, "type"
(( java.util.HashMap ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( java.lang.Object ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
v1 = java.lang.Integer .parseInt ( v1 );
} // .end method
public android.view.View getView ( Integer p0, android.view.View p1, android.view.ViewGroup p2 ) {
/* .locals 6 */
/* .param p1, "position" # I */
/* .param p2, "convertView" # Landroid/view/View; */
/* .param p3, "parent" # Landroid/view/ViewGroup; */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 60 */
/* if-nez p2, :cond_1 */
/* .line 62 */
v3 = this.mInflater;
/* const v4, 0x7f030002 */
(( android.view.LayoutInflater ) v3 ).inflate ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
/* .line 63 */
/* new-instance v1, Lcom/Ina/Notegre/TextAdapter$ViewHolder; */
/* invoke-direct {v1, p0, v5}, Lcom/Ina/Notegre/TextAdapter$ViewHolder;-><init>(Lcom/Ina/Notegre/TextAdapter;Lcom/Ina/Notegre/TextAdapter$ViewHolder;)V */
/* .line 64 */
/* .local v1, "holder":Lcom/Ina/Notegre/TextAdapter$ViewHolder; */
/* const v3, 0x7f090005 */
(( android.view.View ) p2 ).findViewById ( v3 ); // invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v3, Landroid/widget/TextView; */
this.textView = v3;
/* .line 65 */
/* const v3, 0x7f090004 */
(( android.view.View ) p2 ).findViewById ( v3 ); // invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v3, Landroid/widget/ImageView; */
this.icon = v3;
/* .line 66 */
/* const v3, 0x7f090006 */
(( android.view.View ) p2 ).findViewById ( v3 ); // invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v3, Landroid/widget/TextView; */
this.textTime = v3;
/* .line 67 */
(( android.view.View ) p2 ).setTag ( v1 ); // invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
/* .line 74 */
} // :goto_0
v3 = com.Ina.Notegre.TextAdapter.mListMap;
/* check-cast v0, Ljava/util/HashMap; */
/* .line 76 */
/* .local v0, "hashMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v3 = "type"; // const-string v3, "type"
(( java.util.HashMap ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( java.lang.Object ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;
v2 = java.lang.Integer .parseInt ( v3 );
/* .line 77 */
/* .local v2, "nType":I */
int v3 = 1; // const/4 v3, 0x1
/* if-ne v3, v2, :cond_2 */
/* .line 79 */
v4 = this.textView;
final String v3 = "name"; // const-string v3, "name"
(( java.util.HashMap ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v3, Ljava/lang/String; */
(( android.widget.TextView ) v4 ).setText ( v3 ); // invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 80 */
v3 = this.textTime;
final String v4 = ""; // const-string v4, ""
(( android.widget.TextView ) v3 ).setText ( v4 ); // invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 81 */
v3 = this.icon;
v4 = this.mFolderIcon;
(( android.widget.ImageView ) v3 ).setImageBitmap ( v4 ); // invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
/* .line 96 */
} // :cond_0
} // :goto_1
/* .line 71 */
} // .end local v0 # "hashMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
} // .end local v1 # "holder":Lcom/Ina/Notegre/TextAdapter$ViewHolder;
} // .end local v2 # "nType":I
} // :cond_1
(( android.view.View ) p2 ).getTag ( ); // invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;
/* check-cast v1, Lcom/Ina/Notegre/TextAdapter$ViewHolder; */
/* .restart local v1 # "holder":Lcom/Ina/Notegre/TextAdapter$ViewHolder; */
/* .line 83 */
/* .restart local v0 # "hashMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
/* .restart local v2 # "nType":I */
} // :cond_2
int v3 = -1; // const/4 v3, -0x1
/* if-ne v3, v2, :cond_3 */
/* .line 85 */
v4 = this.textView;
final String v3 = "title"; // const-string v3, "title"
(( java.util.HashMap ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v3, Ljava/lang/String; */
(( android.widget.TextView ) v4 ).setText ( v3 ); // invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 86 */
v3 = this.icon;
v4 = this.mIcon;
(( android.widget.ImageView ) v3 ).setImageBitmap ( v4 ); // invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
/* .line 87 */
v4 = this.textTime;
final String v3 = "time"; // const-string v3, "time"
(( java.util.HashMap ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v3, Ljava/lang/String; */
(( android.widget.TextView ) v4 ).setText ( v3 ); // invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 89 */
} // :cond_3
int v3 = 5; // const/4 v3, 0x5
/* if-ne v3, v2, :cond_0 */
/* .line 91 */
v3 = this.textView;
/* const v4, 0x7f07001b */
(( android.widget.TextView ) v3 ).setText ( v4 ); // invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(I)V
/* .line 92 */
v3 = this.textTime;
final String v4 = ""; // const-string v4, ""
(( android.widget.TextView ) v3 ).setText ( v4 ); // invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 93 */
v3 = this.icon;
v4 = this.mRetruniIcon;
(( android.widget.ImageView ) v3 ).setImageBitmap ( v4 ); // invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
} // .end method
