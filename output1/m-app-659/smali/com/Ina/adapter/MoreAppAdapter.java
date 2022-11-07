public class com.Ina.adapter.MoreAppAdapter extends android.widget.BaseAdapter {
	 /* .source "MoreAppAdapter.java" */
	 /* # instance fields */
	 private java.util.ArrayList mArrayList;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList", */
	 /* "<", */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/Object;", */
	 /* ">;>;" */
	 /* } */
} // .end annotation
} // .end field
private android.content.Context mContext;
private mIds;
private java.lang.String mKeys;
private Integer mLayout;
private android.view.LayoutInflater mLayoutInflater;
private android.view.View$OnClickListener onClickListener;
/* # direct methods */
public com.Ina.adapter.MoreAppAdapter ( ) {
/* .locals 1 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p3, "layout" # I */
/* .param p4, "keys" # [Ljava/lang/String; */
/* .param p5, "ids" # [I */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;>;I[", */
/* "Ljava/lang/String;", */
/* "[I)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 29 */
/* .local p2, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;" */
/* invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V */
/* .line 87 */
/* new-instance v0, Lcom/Ina/adapter/MoreAppAdapter$1; */
/* invoke-direct {v0, p0}, Lcom/Ina/adapter/MoreAppAdapter$1;-><init>(Lcom/Ina/adapter/MoreAppAdapter;)V */
this.onClickListener = v0;
/* .line 32 */
android.view.LayoutInflater .from ( p1 );
this.mLayoutInflater = v0;
/* .line 33 */
this.mContext = p1;
/* .line 34 */
this.mArrayList = p2;
/* .line 35 */
this.mKeys = p4;
/* .line 36 */
this.mIds = p5;
/* .line 37 */
/* iput p3, p0, Lcom/Ina/adapter/MoreAppAdapter;->mLayout:I */
/* .line 39 */
return;
} // .end method
static android.content.Context access$0 ( com.Ina.adapter.MoreAppAdapter p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 22 */
v0 = this.mContext;
} // .end method
/* # virtual methods */
public Integer getCount ( ) {
/* .locals 1 */
/* .prologue */
/* .line 44 */
v0 = this.mArrayList;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
} // .end method
public java.lang.Object getItem ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "position" # I */
/* .prologue */
/* .line 51 */
v0 = this.mArrayList;
(( java.util.ArrayList ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
} // .end method
public Long getItemId ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "position" # I */
/* .prologue */
/* .line 58 */
/* int-to-long v0, p1 */
/* return-wide v0 */
} // .end method
public android.view.View getView ( Integer p0, android.view.View p1, android.view.ViewGroup p2 ) {
/* .locals 8 */
/* .param p1, "position" # I */
/* .param p2, "convertView" # Landroid/view/View; */
/* .param p3, "parent" # Landroid/view/ViewGroup; */
/* .prologue */
/* .line 64 */
/* if-nez p2, :cond_0 */
/* .line 66 */
v5 = this.mLayoutInflater;
/* iget v6, p0, Lcom/Ina/adapter/MoreAppAdapter;->mLayout:I */
int v7 = 0; // const/4 v7, 0x0
(( android.view.LayoutInflater ) v5 ).inflate ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
/* .line 69 */
} // :cond_0
v5 = this.mArrayList;
(( java.util.ArrayList ) v5 ).get ( p1 ); // invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Ljava/util/HashMap; */
/* .line 71 */
/* .local v3, "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i":I */
} // :goto_0
v5 = this.mIds;
/* array-length v5, v5 */
/* if-lt v2, v5, :cond_1 */
/* .line 77 */
/* const v5, 0x7f09000a */
(( android.view.View ) p2 ).findViewById ( v5 ); // invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/Button; */
/* .line 78 */
/* .local v1, "buttonStore":Landroid/widget/Button; */
/* const v5, 0x7f09000b */
(( android.view.View ) p2 ).findViewById ( v5 ); // invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/Button; */
/* .line 79 */
/* .local v0, "buttonDown":Landroid/widget/Button; */
final String v5 = "package"; // const-string v5, "package"
(( java.util.HashMap ) v3 ).get ( v5 ); // invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( android.widget.Button ) v1 ).setTag ( v5 ); // invoke-virtual {v1, v5}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V
/* .line 80 */
final String v5 = "address"; // const-string v5, "address"
(( java.util.HashMap ) v3 ).get ( v5 ); // invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( android.widget.Button ) v0 ).setTag ( v5 ); // invoke-virtual {v0, v5}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V
/* .line 81 */
v5 = this.onClickListener;
(( android.widget.Button ) v0 ).setOnClickListener ( v5 ); // invoke-virtual {v0, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 82 */
v5 = this.onClickListener;
(( android.widget.Button ) v1 ).setOnClickListener ( v5 ); // invoke-virtual {v1, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 84 */
/* .line 73 */
} // .end local v0 # "buttonDown":Landroid/widget/Button;
} // .end local v1 # "buttonStore":Landroid/widget/Button;
} // :cond_1
v5 = this.mIds;
/* aget v5, v5, v2 */
(( android.view.View ) p2 ).findViewById ( v5 ); // invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v4, Landroid/widget/TextView; */
/* .line 74 */
/* .local v4, "text":Landroid/widget/TextView; */
v5 = this.mKeys;
/* aget-object v5, v5, v2 */
(( java.util.HashMap ) v3 ).get ( v5 ); // invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( java.lang.Object ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( android.widget.TextView ) v4 ).setText ( v5 ); // invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 71 */
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
