package com.vaadin.client.metadata;

public class ConnectorBundleLoaderImpl extends com.vaadin.client.metadata.ConnectorBundleLoader {
  public void init() {
    addAsyncBlockLoader(new AsyncBundleLoader("__eager", new String[] {"com.vaadin.ui.CssLayout","com.vaadin.ui.JavaScript","com.vaadin.ui.InlineDateField","com.vaadin.server.FileDownloader","com.vaadin.server.BrowserWindowOpener","com.vaadin.ui.BrowserFrame","com.vaadin.ui.CustomComponent","com.vaadin.ui.AbstractJavaScriptComponent","com.vaadin.ui.TextArea","com.vaadin.ui.Image","com.vaadin.ui.ListSelect","com.vaadin.ui.HorizontalSplitPanel","com.vaadin.ui.Audio","com.vaadin.ui.NativeSelect","com.vaadin.ui.Embedded","com.vaadin.ui.Label","com.vaadin.ui.GridLayout","com.vaadin.ui.Form","com.vaadin.ui.Window","com.vaadin.ui.Slider","com.vaadin.ui.VerticalSplitPanel","com.vaadin.ui.TwinColSelect","com.vaadin.ui.PasswordField","com.vaadin.ui.HorizontalLayout","com.vaadin.ui.Panel","com.vaadin.server.AbstractJavaScriptExtension","com.vaadin.ui.TextField","com.vaadin.ui.NativeButton","com.vaadin.ui.Upload","com.vaadin.ui.Tree","com.vaadin.ui.Accordion","com.vaadin.ui.CustomField","com.vaadin.ui.MenuBar","com.vaadin.ui.AbsoluteLayout","com.vaadin.ui.TabSheet","com.vaadin.ui.Button","com.vaadin.ui.PopupView","com.vaadin.ui.DateField","com.vaadin.ui.ProgressIndicator","com.vaadin.ui.VerticalLayout","com.vaadin.ui.CustomLayout","com.vaadin.ui.Link","com.vaadin.ui.OptionGroup","com.vaadin.ui.DragAndDropWrapper","com.vaadin.ui.Flash","com.vaadin.ui.CheckBox","com.vaadin.ui.Video","com.vaadin.ui.UI","com.cs.jqchart.Chart","com.vaadin.ui.Table","com.vaadin.ui.ComboBox","com.vaadin.ui.FormLayout","com.vaadin.ui.TreeTable",}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            store.setClass("com.vaadin.ui.CssLayout", com.vaadin.client.ui.csslayout.CssLayoutConnector.class);
            store.setClass("com.vaadin.ui.JavaScript", com.vaadin.client.extensions.javascriptmanager.JavaScriptManagerConnector.class);
            store.setClass("com.vaadin.ui.InlineDateField", com.vaadin.client.ui.datefield.InlineDateFieldConnector.class);
            store.setClass("com.vaadin.server.FileDownloader", com.vaadin.client.extensions.FileDownloaderConnector.class);
            store.setClass("com.vaadin.server.BrowserWindowOpener", com.vaadin.client.extensions.BrowserWindowOpenerConnector.class);
            store.setClass("com.vaadin.ui.BrowserFrame", com.vaadin.client.ui.browserframe.BrowserFrameConnector.class);
            store.setClass("com.vaadin.ui.CustomComponent", com.vaadin.client.ui.customcomponent.CustomComponentConnector.class);
            store.setClass("com.vaadin.ui.AbstractJavaScriptComponent", com.vaadin.client.ui.JavaScriptComponentConnector.class);
            store.setClass("com.vaadin.ui.TextArea", com.vaadin.client.ui.textarea.TextAreaConnector.class);
            store.setClass("com.vaadin.ui.Image", com.vaadin.client.ui.image.ImageConnector.class);
            store.setClass("com.vaadin.ui.ListSelect", com.vaadin.client.ui.listselect.ListSelectConnector.class);
            store.setClass("com.vaadin.ui.HorizontalSplitPanel", com.vaadin.client.ui.splitpanel.HorizontalSplitPanelConnector.class);
            store.setClass("com.vaadin.ui.Audio", com.vaadin.client.ui.audio.AudioConnector.class);
            store.setClass("com.vaadin.ui.NativeSelect", com.vaadin.client.ui.nativeselect.NativeSelectConnector.class);
            store.setClass("com.vaadin.ui.Embedded", com.vaadin.client.ui.embedded.EmbeddedConnector.class);
            store.setClass("com.vaadin.ui.Label", com.vaadin.client.ui.label.LabelConnector.class);
            store.setClass("com.vaadin.ui.GridLayout", com.vaadin.client.ui.gridlayout.GridLayoutConnector.class);
            store.setClass("com.vaadin.ui.Form", com.vaadin.client.ui.form.FormConnector.class);
            store.setClass("com.vaadin.ui.Window", com.vaadin.client.ui.window.WindowConnector.class);
            store.setClass("com.vaadin.ui.Slider", com.vaadin.client.ui.slider.SliderConnector.class);
            store.setClass("com.vaadin.ui.VerticalSplitPanel", com.vaadin.client.ui.splitpanel.VerticalSplitPanelConnector.class);
            store.setClass("com.vaadin.ui.TwinColSelect", com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class);
            store.setClass("com.vaadin.ui.PasswordField", com.vaadin.client.ui.passwordfield.PasswordFieldConnector.class);
            store.setClass("com.vaadin.ui.HorizontalLayout", com.vaadin.client.ui.orderedlayout.HorizontalLayoutConnector.class);
            store.setClass("com.vaadin.ui.Panel", com.vaadin.client.ui.panel.PanelConnector.class);
            store.setClass("com.vaadin.server.AbstractJavaScriptExtension", com.vaadin.client.JavaScriptExtension.class);
            store.setClass("com.vaadin.ui.TextField", com.vaadin.client.ui.textfield.TextFieldConnector.class);
            store.setClass("com.vaadin.ui.NativeButton", com.vaadin.client.ui.nativebutton.NativeButtonConnector.class);
            store.setClass("com.vaadin.ui.Upload", com.vaadin.client.ui.upload.UploadConnector.class);
            store.setClass("com.vaadin.ui.Tree", com.vaadin.client.ui.tree.TreeConnector.class);
            store.setClass("com.vaadin.ui.Accordion", com.vaadin.client.ui.accordion.AccordionConnector.class);
            store.setClass("com.vaadin.ui.CustomField", com.vaadin.client.ui.customfield.CustomFieldConnector.class);
            store.setClass("com.vaadin.ui.MenuBar", com.vaadin.client.ui.menubar.MenuBarConnector.class);
            store.setClass("com.vaadin.ui.AbsoluteLayout", com.vaadin.client.ui.absolutelayout.AbsoluteLayoutConnector.class);
            store.setClass("com.vaadin.ui.TabSheet", com.vaadin.client.ui.tabsheet.TabsheetConnector.class);
            store.setClass("com.vaadin.ui.Button", com.vaadin.client.ui.button.ButtonConnector.class);
            store.setClass("com.vaadin.ui.PopupView", com.vaadin.client.ui.popupview.PopupViewConnector.class);
            store.setClass("com.vaadin.ui.DateField", com.vaadin.client.ui.datefield.PopupDateFieldConnector.class);
            store.setClass("com.vaadin.ui.ProgressIndicator", com.vaadin.client.ui.progressindicator.ProgressIndicatorConnector.class);
            store.setClass("com.vaadin.ui.VerticalLayout", com.vaadin.client.ui.orderedlayout.VerticalLayoutConnector.class);
            store.setClass("com.vaadin.ui.CustomLayout", com.vaadin.client.ui.customlayout.CustomLayoutConnector.class);
            store.setClass("com.vaadin.ui.Link", com.vaadin.client.ui.link.LinkConnector.class);
            store.setClass("com.vaadin.ui.OptionGroup", com.vaadin.client.ui.optiongroup.OptionGroupConnector.class);
            store.setClass("com.vaadin.ui.DragAndDropWrapper", com.vaadin.client.ui.draganddropwrapper.DragAndDropWrapperConnector.class);
            store.setClass("com.vaadin.ui.Flash", com.vaadin.client.ui.flash.FlashConnector.class);
            store.setClass("com.vaadin.ui.CheckBox", com.vaadin.client.ui.checkbox.CheckBoxConnector.class);
            store.setClass("com.vaadin.ui.Video", com.vaadin.client.ui.video.VideoConnector.class);
            store.setClass("com.vaadin.ui.UI", com.vaadin.client.ui.ui.UIConnector.class);
            store.setClass("com.cs.jqchart.Chart", com.cs.jqchart.gwt.client.connect.JQChartConnector.class);
            store.setClass("com.vaadin.ui.Table", com.vaadin.client.ui.table.TableConnector.class);
            store.setClass("com.vaadin.ui.ComboBox", com.vaadin.client.ui.combobox.ComboBoxConnector.class);
            store.setClass("com.vaadin.ui.FormLayout", com.vaadin.client.ui.formlayout.FormLayoutConnector.class);
            store.setClass("com.vaadin.ui.TreeTable", com.vaadin.client.ui.treetable.TreeTableConnector.class);
            store.setConstructor(com.vaadin.client.ui.VSlider.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VSlider.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.datefield.InlineDateFieldConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.datefield.InlineDateFieldConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VListSelect.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VListSelect.class);
              }
            });
            store.setConstructor(com.vaadin.client.extensions.FileDownloaderConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.extensions.FileDownloaderConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.label.LabelState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.label.LabelState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.slider.SliderState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.slider.SliderState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.browserframe.BrowserFrameConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.browserframe.BrowserFrameConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VTabsheet.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VTabsheet.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VNativeButton.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VNativeButton.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.panel.PanelState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.panel.PanelState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.tabsheet.TabsheetState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.tabsheet.TabsheetState.class);
              }
            });
            store.setConstructor(com.cs.jqchart.gwt.client.GwtJQChart.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.cs.jqchart.gwt.client.GwtJQChart.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.audio.AudioConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.audio.AudioConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VTextField.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VTextField.class);
              }
            });
            store.setConstructor(com.vaadin.shared.MouseEventDetails.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.MouseEventDetails.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.embedded.EmbeddedConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.embedded.EmbeddedConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.label.LabelConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.label.LabelConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.gridlayout.GridLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.gridlayout.GridLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.AbstractFieldState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.AbstractFieldState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.form.FormConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.form.FormConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VUpload.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VUpload.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.slider.SliderConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.slider.SliderConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.window.WindowConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.window.WindowConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.menubar.MenuBarState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.menubar.MenuBarState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.popupview.PopupViewState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.popupview.PopupViewState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.passwordfield.PasswordFieldConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.passwordfield.PasswordFieldConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.orderedlayout.HorizontalLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.orderedlayout.HorizontalLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.panel.PanelConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.panel.PanelConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VGridLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VGridLayout.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VSplitPanelHorizontal.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VSplitPanelHorizontal.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.tree.TreeState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.tree.TreeState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.BrowserWindowOpenerState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.BrowserWindowOpenerState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VSplitPanelVertical.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VSplitPanelVertical.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.button.NativeButtonState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.button.NativeButtonState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VScrollTable.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VScrollTable.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.upload.UploadConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.upload.UploadConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VPopupView.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VPopupView.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.tree.TreeConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.tree.TreeConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.browserframe.BrowserFrameState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VForm.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VForm.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.customfield.CustomFieldConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.customfield.CustomFieldConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.datefield.PopupDateFieldState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.embedded.EmbeddedState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.embedded.EmbeddedState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.menubar.MenuBarConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.menubar.MenuBarConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.image.ImageState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.image.ImageState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.customlayout.CustomLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.absolutelayout.AbsoluteLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.absolutelayout.AbsoluteLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.button.ButtonConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.button.ButtonConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VTextArea.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VTextArea.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VFilterSelect.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VFilterSelect.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VFormLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VFormLayout.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.gridlayout.GridLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VTreeTable.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VTreeTable.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VTree.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VTree.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.datefield.PopupDateFieldConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.datefield.PopupDateFieldConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.progressindicator.ProgressIndicatorConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.progressindicator.ProgressIndicatorConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VVerticalLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VVerticalLayout.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.orderedlayout.VerticalLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.orderedlayout.VerticalLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.optiongroup.OptionGroupConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.optiongroup.OptionGroupConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.flash.FlashConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.flash.FlashConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.checkbox.CheckBoxState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.checkbox.CheckBoxState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VEmbedded.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VEmbedded.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.video.VideoConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.video.VideoConnector.class);
              }
            });
            store.setConstructor(com.cs.jqchart.gwt.client.connect.JQChartConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.cs.jqchart.gwt.client.connect.JQChartConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.ui.UIConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.ui.UIConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VButton.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VButton.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.combobox.ComboBoxConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.combobox.ComboBoxConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.table.TableConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.table.TableConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VUnknownComponent.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VUnknownComponent.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.formlayout.FormLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.formlayout.FormLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VDragAndDropWrapper.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VDragAndDropWrapper.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VDateFieldCalendar.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VDateFieldCalendar.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VPopupCalendar.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VPopupCalendar.class);
              }
            });
            store.setConstructor(com.cs.jqchart.gwt.client.shared.JQChartState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.cs.jqchart.gwt.client.shared.JQChartState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.csslayout.CssLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.csslayout.CssLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.extensions.javascriptmanager.JavaScriptManagerConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.extensions.javascriptmanager.JavaScriptManagerConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VMenuBar.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VMenuBar.class);
              }
            });
            store.setConstructor(com.vaadin.client.extensions.BrowserWindowOpenerConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.extensions.BrowserWindowOpenerConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.customcomponent.CustomComponentConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.customcomponent.CustomComponentConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.JavaScriptComponentConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.JavaScriptComponentConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.textarea.TextAreaConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.textarea.TextAreaConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.form.FormState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.form.FormState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.image.ImageConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.image.ImageConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.listselect.ListSelectConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.listselect.ListSelectConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.splitpanel.HorizontalSplitPanelConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.splitpanel.HorizontalSplitPanelConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.JavaScriptExtensionState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.JavaScriptExtensionState.class);
              }
            });
            load0();
          }
          private void load0() {
            store.setConstructor(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.datefield.InlineDateFieldState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VBrowserFrame.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VBrowserFrame.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VCssLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VCssLayout.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.AbstractMediaState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.AbstractMediaState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VCustomLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VCustomLayout.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VHorizontalLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VHorizontalLayout.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.splitpanel.VerticalSplitPanelConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.splitpanel.VerticalSplitPanelConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VAccordion.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VAccordion.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.table.TableState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.table.TableState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VNativeSelect.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VNativeSelect.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.link.LinkState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.link.LinkState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VWindow.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VWindow.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.flash.FlashState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.flash.FlashState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VTwinColSelect.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VTwinColSelect.class);
              }
            });
            store.setConstructor(com.vaadin.client.JavaScriptExtension.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.JavaScriptExtension.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VPasswordField.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VPasswordField.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VAbsoluteLayout.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VAbsoluteLayout.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.textfield.TextFieldConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.textfield.TextFieldConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.nativebutton.NativeButtonConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.nativebutton.NativeButtonConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.accordion.AccordionConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.accordion.AccordionConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VProgressIndicator.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VProgressIndicator.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.treetable.TreeTableState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.treetable.TreeTableState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.optiongroup.OptionGroupState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.ui.UIState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.ui.UIState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VFlash.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VFlash.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.combobox.ComboBoxState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.combobox.ComboBoxState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VImage.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VImage.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VVideo.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VVideo.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.tabsheet.TabsheetConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.tabsheet.TabsheetConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.AbstractComponentState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.AbstractComponentState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.csslayout.CssLayoutState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.csslayout.CssLayoutState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VLink.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VLink.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.button.ButtonState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.button.ButtonState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.window.WindowState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.window.WindowState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.popupview.PopupViewConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.popupview.PopupViewConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VCheckBox.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VCheckBox.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.customlayout.CustomLayoutConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.customlayout.CustomLayoutConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.link.LinkConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.link.LinkConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VPanel.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VPanel.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.video.VideoState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.video.VideoState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VLabel.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VLabel.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.JavaScriptWidget.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.JavaScriptWidget.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.draganddropwrapper.DragAndDropWrapperConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.draganddropwrapper.DragAndDropWrapperConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.checkbox.CheckBoxConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.checkbox.CheckBoxConnector.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VUI.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VUI.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VOptionGroup.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VOptionGroup.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.textarea.TextAreaState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.textarea.TextAreaState.class);
              }
            });
            store.setConstructor(com.vaadin.shared.communication.SharedState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.communication.SharedState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.treetable.TreeTableConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.treetable.TreeTableConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.JavaScriptComponentState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.JavaScriptComponentState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.VCustomComponent.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VCustomComponent.class);
              }
            });
            store.setReturnType(com.vaadin.client.ui.csslayout.CssLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VCssLayout.class));
            store.setReturnType(com.vaadin.client.ui.csslayout.CssLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.csslayout.CssLayoutState.class));
            store.setReturnType(com.vaadin.client.extensions.javascriptmanager.JavaScriptManagerConnector.class, "getState", new Type(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class));
            store.setReturnType(com.vaadin.client.ui.datefield.InlineDateFieldConnector.class, "getState", new Type(com.vaadin.shared.ui.datefield.InlineDateFieldState.class));
            store.setReturnType(com.vaadin.client.ui.datefield.InlineDateFieldConnector.class, "getWidget", new Type(com.vaadin.client.ui.VDateFieldCalendar.class));
            store.setReturnType(com.vaadin.client.extensions.FileDownloaderConnector.class, "getState", new Type(com.vaadin.shared.communication.SharedState.class));
            store.setReturnType(com.vaadin.client.extensions.BrowserWindowOpenerConnector.class, "getState", new Type(com.vaadin.shared.ui.BrowserWindowOpenerState.class));
            store.setReturnType(com.vaadin.client.ui.browserframe.BrowserFrameConnector.class, "getState", new Type(com.vaadin.shared.ui.browserframe.BrowserFrameState.class));
            store.setReturnType(com.vaadin.client.ui.browserframe.BrowserFrameConnector.class, "getWidget", new Type(com.vaadin.client.ui.VBrowserFrame.class));
            store.setReturnType(com.vaadin.client.ui.customcomponent.CustomComponentConnector.class, "getState", new Type(com.vaadin.shared.AbstractComponentState.class));
            store.setReturnType(com.vaadin.client.ui.customcomponent.CustomComponentConnector.class, "getWidget", new Type(com.vaadin.client.ui.VCustomComponent.class));
            store.setReturnType(com.vaadin.client.ui.JavaScriptComponentConnector.class, "getState", new Type(com.vaadin.shared.ui.JavaScriptComponentState.class));
            store.setReturnType(com.vaadin.client.ui.JavaScriptComponentConnector.class, "getWidget", new Type(com.vaadin.client.ui.JavaScriptWidget.class));
            store.setReturnType(com.vaadin.client.ui.textarea.TextAreaConnector.class, "getState", new Type(com.vaadin.shared.ui.textarea.TextAreaState.class));
            store.setReturnType(com.vaadin.client.ui.textarea.TextAreaConnector.class, "getWidget", new Type(com.vaadin.client.ui.VTextArea.class));
            store.setReturnType(com.vaadin.client.ui.image.ImageConnector.class, "getState", new Type(com.vaadin.shared.ui.image.ImageState.class));
            store.setReturnType(com.vaadin.client.ui.image.ImageConnector.class, "getWidget", new Type(com.vaadin.client.ui.VImage.class));
            store.setReturnType(com.vaadin.client.ui.listselect.ListSelectConnector.class, "getWidget", new Type(com.vaadin.client.ui.VListSelect.class));
            store.setReturnType(com.vaadin.client.ui.listselect.ListSelectConnector.class, "getState", new Type(com.vaadin.shared.AbstractFieldState.class));
            store.setReturnType(com.vaadin.client.ui.splitpanel.HorizontalSplitPanelConnector.class, "getWidget", new Type(com.vaadin.client.ui.VSplitPanelHorizontal.class));
            store.setReturnType(com.vaadin.client.ui.splitpanel.HorizontalSplitPanelConnector.class, "getState", new Type(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class));
            store.setReturnType(com.vaadin.client.ui.audio.AudioConnector.class, "getState", new Type(com.vaadin.shared.ui.AbstractMediaState.class));
            store.setReturnType(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, "getWidget", new Type(com.vaadin.client.ui.VNativeSelect.class));
            store.setReturnType(com.vaadin.client.ui.nativeselect.NativeSelectConnector.class, "getState", new Type(com.vaadin.shared.AbstractFieldState.class));
            store.setReturnType(com.vaadin.client.ui.embedded.EmbeddedConnector.class, "getWidget", new Type(com.vaadin.client.ui.VEmbedded.class));
            store.setReturnType(com.vaadin.client.ui.embedded.EmbeddedConnector.class, "getState", new Type(com.vaadin.shared.ui.embedded.EmbeddedState.class));
            store.setReturnType(com.vaadin.client.ui.label.LabelConnector.class, "getState", new Type(com.vaadin.shared.ui.label.LabelState.class));
            store.setReturnType(com.vaadin.client.ui.label.LabelConnector.class, "getWidget", new Type(com.vaadin.client.ui.VLabel.class));
            store.setReturnType(com.vaadin.client.ui.gridlayout.GridLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.gridlayout.GridLayoutState.class));
            store.setReturnType(com.vaadin.client.ui.gridlayout.GridLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VGridLayout.class));
            store.setReturnType(com.vaadin.client.ui.form.FormConnector.class, "getState", new Type(com.vaadin.shared.ui.form.FormState.class));
            store.setReturnType(com.vaadin.client.ui.form.FormConnector.class, "getWidget", new Type(com.vaadin.client.ui.VForm.class));
            store.setReturnType(com.vaadin.client.ui.window.WindowConnector.class, "getWidget", new Type(com.vaadin.client.ui.VWindow.class));
            store.setReturnType(com.vaadin.client.ui.window.WindowConnector.class, "getState", new Type(com.vaadin.shared.ui.window.WindowState.class));
            store.setReturnType(com.vaadin.client.ui.slider.SliderConnector.class, "getWidget", new Type(com.vaadin.client.ui.VSlider.class));
            store.setReturnType(com.vaadin.client.ui.slider.SliderConnector.class, "getState", new Type(com.vaadin.shared.ui.slider.SliderState.class));
            store.setReturnType(com.vaadin.client.ui.splitpanel.VerticalSplitPanelConnector.class, "getState", new Type(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class));
            store.setReturnType(com.vaadin.client.ui.splitpanel.VerticalSplitPanelConnector.class, "getWidget", new Type(com.vaadin.client.ui.VSplitPanelVertical.class));
            store.setReturnType(com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class, "getWidget", new Type(com.vaadin.client.ui.VTwinColSelect.class));
            store.setReturnType(com.vaadin.client.ui.twincolselect.TwinColSelectConnector.class, "getState", new Type(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class));
            store.setReturnType(com.vaadin.client.ui.passwordfield.PasswordFieldConnector.class, "getState", new Type(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class));
            store.setReturnType(com.vaadin.client.ui.passwordfield.PasswordFieldConnector.class, "getWidget", new Type(com.vaadin.client.ui.VPasswordField.class));
            store.setReturnType(com.vaadin.client.ui.orderedlayout.HorizontalLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VHorizontalLayout.class));
            store.setReturnType(com.vaadin.client.ui.orderedlayout.HorizontalLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class));
            store.setReturnType(com.vaadin.client.ui.panel.PanelConnector.class, "getState", new Type(com.vaadin.shared.ui.panel.PanelState.class));
            store.setReturnType(com.vaadin.client.ui.panel.PanelConnector.class, "getWidget", new Type(com.vaadin.client.ui.VPanel.class));
            store.setReturnType(com.vaadin.client.ui.UnknownComponentConnector.class, "getState", new Type(com.vaadin.shared.AbstractComponentState.class));
            store.setReturnType(com.vaadin.client.ui.UnknownComponentConnector.class, "getWidget", new Type(com.vaadin.client.ui.VUnknownComponent.class));
            store.setReturnType(com.vaadin.client.JavaScriptExtension.class, "getState", new Type(com.vaadin.shared.JavaScriptExtensionState.class));
            store.setReturnType(com.vaadin.client.ui.textfield.TextFieldConnector.class, "getState", new Type(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class));
            store.setReturnType(com.vaadin.client.ui.textfield.TextFieldConnector.class, "getWidget", new Type(com.vaadin.client.ui.VTextField.class));
            store.setReturnType(com.vaadin.client.ui.nativebutton.NativeButtonConnector.class, "getState", new Type(com.vaadin.shared.ui.button.NativeButtonState.class));
            store.setReturnType(com.vaadin.client.ui.nativebutton.NativeButtonConnector.class, "getWidget", new Type(com.vaadin.client.ui.VNativeButton.class));
            store.setReturnType(com.vaadin.client.ui.upload.UploadConnector.class, "getState", new Type(com.vaadin.shared.AbstractComponentState.class));
            store.setReturnType(com.vaadin.client.ui.upload.UploadConnector.class, "getWidget", new Type(com.vaadin.client.ui.VUpload.class));
            store.setReturnType(com.vaadin.client.ui.tree.TreeConnector.class, "getWidget", new Type(com.vaadin.client.ui.VTree.class));
            store.setReturnType(com.vaadin.client.ui.tree.TreeConnector.class, "getState", new Type(com.vaadin.shared.ui.tree.TreeState.class));
            store.setReturnType(com.vaadin.client.ui.accordion.AccordionConnector.class, "getWidget", new Type(com.vaadin.client.ui.VAccordion.class));
            store.setReturnType(com.vaadin.client.ui.accordion.AccordionConnector.class, "getState", new Type(com.vaadin.shared.AbstractComponentState.class));
            store.setReturnType(com.vaadin.client.ui.customfield.CustomFieldConnector.class, "getWidget", new Type(com.vaadin.client.ui.VCustomComponent.class));
            store.setReturnType(com.vaadin.client.ui.customfield.CustomFieldConnector.class, "getState", new Type(com.vaadin.shared.AbstractFieldState.class));
            store.setReturnType(com.vaadin.client.ui.menubar.MenuBarConnector.class, "getWidget", new Type(com.vaadin.client.ui.VMenuBar.class));
            store.setReturnType(com.vaadin.client.ui.menubar.MenuBarConnector.class, "getState", new Type(com.vaadin.shared.ui.menubar.MenuBarState.class));
            store.setReturnType(com.vaadin.client.ui.absolutelayout.AbsoluteLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VAbsoluteLayout.class));
            store.setReturnType(com.vaadin.client.ui.absolutelayout.AbsoluteLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class));
            store.setReturnType(com.vaadin.client.ui.tabsheet.TabsheetConnector.class, "getWidget", new Type(com.vaadin.client.ui.VTabsheet.class));
            store.setReturnType(com.vaadin.client.ui.tabsheet.TabsheetConnector.class, "getState", new Type(com.vaadin.shared.ui.tabsheet.TabsheetState.class));
            store.setReturnType(com.vaadin.client.ui.button.ButtonConnector.class, "getState", new Type(com.vaadin.shared.ui.button.ButtonState.class));
            store.setReturnType(com.vaadin.client.ui.button.ButtonConnector.class, "getWidget", new Type(com.vaadin.client.ui.VButton.class));
            store.setReturnType(com.vaadin.client.ui.popupview.PopupViewConnector.class, "getState", new Type(com.vaadin.shared.ui.popupview.PopupViewState.class));
            store.setReturnType(com.vaadin.client.ui.popupview.PopupViewConnector.class, "getWidget", new Type(com.vaadin.client.ui.VPopupView.class));
            store.setReturnType(com.vaadin.client.ui.datefield.PopupDateFieldConnector.class, "getState", new Type(com.vaadin.shared.ui.datefield.PopupDateFieldState.class));
            store.setReturnType(com.vaadin.client.ui.datefield.PopupDateFieldConnector.class, "getWidget", new Type(com.vaadin.client.ui.VPopupCalendar.class));
            store.setReturnType(com.vaadin.client.ui.progressindicator.ProgressIndicatorConnector.class, "getState", new Type(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class));
            store.setReturnType(com.vaadin.client.ui.progressindicator.ProgressIndicatorConnector.class, "getWidget", new Type(com.vaadin.client.ui.VProgressIndicator.class));
            store.setReturnType(com.vaadin.client.ui.orderedlayout.VerticalLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VVerticalLayout.class));
            store.setReturnType(com.vaadin.client.ui.orderedlayout.VerticalLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class));
            store.setReturnType(com.vaadin.client.ui.customlayout.CustomLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.customlayout.CustomLayoutState.class));
            store.setReturnType(com.vaadin.client.ui.customlayout.CustomLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VCustomLayout.class));
            store.setReturnType(com.vaadin.client.ui.link.LinkConnector.class, "getWidget", new Type(com.vaadin.client.ui.VLink.class));
            store.setReturnType(com.vaadin.client.ui.link.LinkConnector.class, "getState", new Type(com.vaadin.shared.ui.link.LinkState.class));
            store.setReturnType(com.vaadin.client.ui.optiongroup.OptionGroupConnector.class, "getState", new Type(com.vaadin.shared.ui.optiongroup.OptionGroupState.class));
            store.setReturnType(com.vaadin.client.ui.optiongroup.OptionGroupConnector.class, "getWidget", new Type(com.vaadin.client.ui.VOptionGroup.class));
            store.setReturnType(com.vaadin.client.ui.draganddropwrapper.DragAndDropWrapperConnector.class, "getState", new Type(com.vaadin.shared.AbstractComponentState.class));
            store.setReturnType(com.vaadin.client.ui.draganddropwrapper.DragAndDropWrapperConnector.class, "getWidget", new Type(com.vaadin.client.ui.VDragAndDropWrapper.class));
            store.setReturnType(com.vaadin.client.ui.flash.FlashConnector.class, "getWidget", new Type(com.vaadin.client.ui.VFlash.class));
            store.setReturnType(com.vaadin.client.ui.flash.FlashConnector.class, "getState", new Type(com.vaadin.shared.ui.flash.FlashState.class));
            store.setReturnType(com.vaadin.client.ui.checkbox.CheckBoxConnector.class, "getWidget", new Type(com.vaadin.client.ui.VCheckBox.class));
            store.setReturnType(com.vaadin.client.ui.checkbox.CheckBoxConnector.class, "getState", new Type(com.vaadin.shared.ui.checkbox.CheckBoxState.class));
            store.setReturnType(com.vaadin.client.ui.video.VideoConnector.class, "getState", new Type(com.vaadin.shared.ui.video.VideoState.class));
            store.setReturnType(com.vaadin.client.ui.video.VideoConnector.class, "getWidget", new Type(com.vaadin.client.ui.VVideo.class));
            store.setReturnType(com.vaadin.client.ui.ui.UIConnector.class, "getState", new Type(com.vaadin.shared.ui.ui.UIState.class));
            store.setReturnType(com.vaadin.client.ui.ui.UIConnector.class, "getWidget", new Type(com.vaadin.client.ui.VUI.class));
            store.setReturnType(com.cs.jqchart.gwt.client.connect.JQChartConnector.class, "getWidget", new Type(com.cs.jqchart.gwt.client.GwtJQChart.class));
            store.setReturnType(com.cs.jqchart.gwt.client.connect.JQChartConnector.class, "getState", new Type(com.cs.jqchart.gwt.client.shared.JQChartState.class));
            store.setReturnType(com.vaadin.client.ui.table.TableConnector.class, "getWidget", new Type(com.vaadin.client.ui.VScrollTable.class));
            store.setReturnType(com.vaadin.client.ui.table.TableConnector.class, "getState", new Type(com.vaadin.shared.ui.table.TableState.class));
            store.setReturnType(com.vaadin.client.ui.combobox.ComboBoxConnector.class, "getState", new Type(com.vaadin.shared.ui.combobox.ComboBoxState.class));
            store.setReturnType(com.vaadin.client.ui.combobox.ComboBoxConnector.class, "getWidget", new Type(com.vaadin.client.ui.VFilterSelect.class));
            store.setReturnType(com.vaadin.client.ui.formlayout.FormLayoutConnector.class, "getState", new Type(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class));
            store.setReturnType(com.vaadin.client.ui.formlayout.FormLayoutConnector.class, "getWidget", new Type(com.vaadin.client.ui.VFormLayout.class));
            store.setReturnType(com.vaadin.client.ui.treetable.TreeTableConnector.class, "getWidget", new Type(com.vaadin.client.ui.VTreeTable.class));
            store.setReturnType(com.vaadin.client.ui.treetable.TreeTableConnector.class, "getState", new Type(com.vaadin.shared.ui.treetable.TreeTableState.class));
            load1();
          }
          private void load1() {
            store.setInvoker(com.vaadin.shared.ui.MediaControl.class, "play", new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.MediaControl) target).play();
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.MediaControl.class, "pause", new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.MediaControl) target).pause();
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VTextArea.class, "setWordwrap", new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VTextArea) target).setWordwrap((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VTextArea.class, "setRows", new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VTextArea) target).setRows((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.extension.javascriptmanager.ExecuteJavaScriptRpc.class, "executeJavaScript", new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.extension.javascriptmanager.ExecuteJavaScriptRpc) target).executeJavaScript((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.ui.ScrollClientRpc.class, "setScrollTop", new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.ui.ScrollClientRpc) target).setScrollTop((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.ui.ScrollClientRpc.class, "setScrollLeft", new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.ui.ScrollClientRpc) target).setScrollLeft((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.shared.ui.ui.PageClientRpc.class, "setTitle", new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.shared.ui.ui.PageClientRpc) target).setTitle((java.lang.String) params[0]);
                return null;
              }
            });
            store.setParamTypes(com.vaadin.shared.ui.button.ButtonServerRpc.class, "disableOnClick", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.button.ButtonServerRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutServerRpc.class, "layoutClick", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), new Type(com.vaadin.shared.Connector.class), });
            store.setParamTypes(com.vaadin.shared.ui.gridlayout.GridLayoutServerRpc.class, "layoutClick", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), new Type(com.vaadin.shared.Connector.class), });
            store.setParamTypes(com.vaadin.shared.ui.MediaControl.class, "play", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.MediaControl.class, "pause", new Type[] {});
            store.setParamTypes(com.vaadin.shared.communication.FieldRpc.FocusAndBlurServerRpc.class, "focus", new Type[] {});
            store.setParamTypes(com.vaadin.shared.communication.FieldRpc.FocusAndBlurServerRpc.class, "blur", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.colorpicker.ColorPickerServerRpc.class, "openPopup", new Type[] {new Type(java.lang.Boolean.class), });
            store.setParamTypes(com.cs.jqchart.gwt.client.connect.JQChartServerRpc.class, "onValueChanged", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.communication.FieldRpc.BlurServerRpc.class, "blur", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.ui.PageClientRpc.class, "setTitle", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.image.ImageServerRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.checkbox.CheckBoxServerRpc.class, "setChecked", new Type[] {new Type(java.lang.Boolean.class), new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.progressindicator.ProgressIndicatorServerRpc.class, "poll", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.popupview.PopupViewServerRpc.class, "setPopupVisibility", new Type[] {new Type(java.lang.Boolean.class), });
            store.setParamTypes(com.vaadin.shared.ui.embedded.EmbeddedServerRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.extension.javascriptmanager.ExecuteJavaScriptRpc.class, "executeJavaScript", new Type[] {new Type(java.lang.String.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.ScrollClientRpc.class, "setScrollTop", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.ScrollClientRpc.class, "setScrollLeft", new Type[] {new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelRpc.class, "splitterClick", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelRpc.class, "setSplitterPosition", new Type[] {new Type(java.lang.Float.class), });
            store.setParamTypes(com.vaadin.shared.communication.FieldRpc.FocusServerRpc.class, "focus", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.LayoutClickRpc.class, "layoutClick", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), new Type(com.vaadin.shared.Connector.class), });
            store.setParamTypes(com.vaadin.shared.ui.csslayout.CssLayoutServerRpc.class, "layoutClick", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), new Type(com.vaadin.shared.Connector.class), });
            store.setParamTypes(com.vaadin.shared.ui.panel.PanelServerRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.colorpicker.ColorPickerGradientServerRpc.class, "select", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.slider.SliderServerRpc.class, "valueChanged", new Type[] {new Type(java.lang.Double.class), });
            store.setParamTypes(com.vaadin.shared.ui.window.WindowServerRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutServerRpc.class, "layoutClick", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), new Type(com.vaadin.shared.Connector.class), });
            store.setParamTypes(com.vaadin.shared.ui.colorpicker.ColorPickerGridServerRpc.class, "select", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.colorpicker.ColorPickerGridServerRpc.class, "refresh", new Type[] {});
            store.setParamTypes(com.vaadin.shared.ui.ClickRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.UIServerRpc.class, "click", new Type[] {new Type(com.vaadin.shared.MouseEventDetails.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.UIServerRpc.class, "scroll", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setParamTypes(com.vaadin.shared.ui.ui.UIServerRpc.class, "resize", new Type[] {new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), new Type(java.lang.Integer.class), });
            store.setProxyHandler(com.vaadin.shared.ui.button.ButtonServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.button.ButtonServerRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.button.ButtonServerRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                  public void disableOnClick() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.button.ButtonServerRpc.class).getMethod("disableOnClick"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.gridlayout.GridLayoutServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.gridlayout.GridLayoutServerRpc() {
                  public void layoutClick(com.vaadin.shared.MouseEventDetails p0, com.vaadin.shared.Connector p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.gridlayout.GridLayoutServerRpc.class).getMethod("layoutClick"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutServerRpc() {
                  public void layoutClick(com.vaadin.shared.MouseEventDetails p0, com.vaadin.shared.Connector p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutServerRpc.class).getMethod("layoutClick"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.splitpanel.AbstractSplitPanelRpc() {
                  public void setSplitterPosition(float p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelRpc.class).getMethod("setSplitterPosition"), new Object [] {p0, });
                  }
                  public void splitterClick(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelRpc.class).getMethod("splitterClick"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.communication.FieldRpc.FocusServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.communication.FieldRpc.FocusServerRpc() {
                  public void focus() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.communication.FieldRpc.FocusServerRpc.class).getMethod("focus"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.LayoutClickRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.LayoutClickRpc() {
                  public void layoutClick(com.vaadin.shared.MouseEventDetails p0, com.vaadin.shared.Connector p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.LayoutClickRpc.class).getMethod("layoutClick"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.colorpicker.ColorPickerServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.colorpicker.ColorPickerServerRpc() {
                  public void openPopup(boolean p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.colorpicker.ColorPickerServerRpc.class).getMethod("openPopup"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.communication.FieldRpc.FocusAndBlurServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.communication.FieldRpc.FocusAndBlurServerRpc() {
                  public void blur() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.communication.FieldRpc.FocusAndBlurServerRpc.class).getMethod("blur"), new Object [] {});
                  }
                  public void focus() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.communication.FieldRpc.FocusAndBlurServerRpc.class).getMethod("focus"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.csslayout.CssLayoutServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.csslayout.CssLayoutServerRpc() {
                  public void layoutClick(com.vaadin.shared.MouseEventDetails p0, com.vaadin.shared.Connector p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.csslayout.CssLayoutServerRpc.class).getMethod("layoutClick"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.cs.jqchart.gwt.client.connect.JQChartServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.cs.jqchart.gwt.client.connect.JQChartServerRpc() {
                  public void onValueChanged(java.lang.String p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.cs.jqchart.gwt.client.connect.JQChartServerRpc.class).getMethod("onValueChanged"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.communication.FieldRpc.BlurServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.communication.FieldRpc.BlurServerRpc() {
                  public void blur() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.communication.FieldRpc.BlurServerRpc.class).getMethod("blur"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.image.ImageServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.image.ImageServerRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.image.ImageServerRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.panel.PanelServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.panel.PanelServerRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.panel.PanelServerRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.colorpicker.ColorPickerGradientServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.colorpicker.ColorPickerGradientServerRpc() {
                  public void select(int p0, int p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientServerRpc.class).getMethod("select"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.slider.SliderServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.slider.SliderServerRpc() {
                  public void valueChanged(double p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.slider.SliderServerRpc.class).getMethod("valueChanged"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.window.WindowServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.window.WindowServerRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.window.WindowServerRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutServerRpc() {
                  public void layoutClick(com.vaadin.shared.MouseEventDetails p0, com.vaadin.shared.Connector p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutServerRpc.class).getMethod("layoutClick"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.checkbox.CheckBoxServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.checkbox.CheckBoxServerRpc() {
                  public void setChecked(boolean p0, com.vaadin.shared.MouseEventDetails p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.checkbox.CheckBoxServerRpc.class).getMethod("setChecked"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.popupview.PopupViewServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.popupview.PopupViewServerRpc() {
                  public void setPopupVisibility(boolean p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.popupview.PopupViewServerRpc.class).getMethod("setPopupVisibility"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.progressindicator.ProgressIndicatorServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.progressindicator.ProgressIndicatorServerRpc() {
                  public void poll() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorServerRpc.class).getMethod("poll"), new Object [] {});
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.ClickRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.ClickRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ClickRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.colorpicker.ColorPickerGridServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.colorpicker.ColorPickerGridServerRpc() {
                  public void refresh() {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.colorpicker.ColorPickerGridServerRpc.class).getMethod("refresh"), new Object [] {});
                  }
                  public void select(int p0, int p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.colorpicker.ColorPickerGridServerRpc.class).getMethod("select"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.embedded.EmbeddedServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.embedded.EmbeddedServerRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.embedded.EmbeddedServerRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                };
              }
            });
            store.setProxyHandler(com.vaadin.shared.ui.ui.UIServerRpc.class, new com.vaadin.client.metadata.ProxyHandler() {
              public Object createProxy(final com.vaadin.client.metadata.InvokationHandler handler) {
                return new com.vaadin.shared.ui.ui.UIServerRpc() {
                  public void click(com.vaadin.shared.MouseEventDetails p0) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ui.UIServerRpc.class).getMethod("click"), new Object [] {p0, });
                  }
                  public void resize(int p0, int p1, int p2, int p3) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ui.UIServerRpc.class).getMethod("resize"), new Object [] {p0, p1, p2, p3, });
                  }
                  public void scroll(int p0, int p1) {
                    handler.invoke(this, com.vaadin.client.metadata.TypeData.getType(com.vaadin.shared.ui.ui.UIServerRpc.class).getMethod("scroll"), new Object [] {p0, p1, });
                  }
                };
              }
            });
            store.setDelayed(com.vaadin.shared.ui.ui.UIServerRpc.class, "scroll");
            store.setLastOnly(com.vaadin.shared.ui.ui.UIServerRpc.class, "scroll");
            store.setDelayed(com.vaadin.shared.ui.ui.UIServerRpc.class, "resize");
            store.setLastOnly(com.vaadin.shared.ui.ui.UIServerRpc.class, "resize");
            store.setProperties(com.cs.jqchart.gwt.client.shared.JQChartState.class, new String[] {"initJS", "resources", "caption", "primaryStyleName", "dataClickJS", "width", "immediate", "styles", "errorMessage", "registeredEventListeners", "lastUpdateTime", "description", "readOnly", "id", "uuid", "height", "enabled", "refreshJS", "clickJS", });
            store.setProperties(com.vaadin.shared.ui.label.LabelState.class, new String[] {"contentMode", "readOnly", "text", "primaryStyleName", "description", "width", "errorMessage", "immediate", "id", "caption", "styles", "registeredEventListeners", "enabled", "resources", "height", });
            store.setProperties(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, new String[] {"enabled", "description", "errorMessage", "registeredEventListeners", "childData", "resources", "styles", "width", "immediate", "id", "primaryStyleName", "marginsBitmask", "spacing", "caption", "height", "readOnly", });
            store.setProperties(com.vaadin.shared.ui.slider.SliderState.class, new String[] {"errorMessage", "readOnly", "tabIndex", "description", "height", "orientation", "required", "registeredEventListeners", "resources", "hideErrors", "modified", "styles", "immediate", "id", "minValue", "enabled", "caption", "value", "primaryStyleName", "propertyReadOnly", "maxValue", "width", "resolution", });
            store.setProperties(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, new String[] {"locked", "maxPositionUnit", "minPositionUnit", "positionUnit", "maxPosition", "minPosition", "position", "positionReversed", });
            store.setProperties(java.util.HashMap.class, new String[] {});
            store.setProperties(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, new String[] {"errorMessage", "primaryStyleName", "caption", "registeredEventListeners", "description", "spacing", "id", "marginsBitmask", "styles", "readOnly", "immediate", "enabled", "height", "childData", "width", "resources", });
            store.setProperties(com.vaadin.shared.ui.form.FormState.class, new String[] {"readOnly", "layout", "caption", "enabled", "primaryStyleName", "id", "errorMessage", "width", "styles", "description", "resources", "hideErrors", "tabIndex", "immediate", "registeredEventListeners", "required", "height", "footer", "propertyReadOnly", "modified", });
            store.setProperties(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, new String[] {"modified", "enabled", "errorMessage", "description", "registeredEventListeners", "immediate", "height", "caption", "propertyReadOnly", "hideErrors", "required", "id", "tabIndex", "width", "readOnly", "resources", "primaryStyleName", "styles", });
            store.setProperties(com.vaadin.shared.JavaScriptExtensionState.class, new String[] {"registeredEventListeners", "enabled", "resources", "callbackNames", "rpcInterfaces", });
            store.setProperties(com.vaadin.shared.ui.panel.PanelState.class, new String[] {"width", "id", "description", "registeredEventListeners", "styles", "tabIndex", "height", "readOnly", "scrollTop", "errorMessage", "enabled", "resources", "caption", "primaryStyleName", "immediate", "scrollLeft", });
            store.setProperties(com.vaadin.shared.ui.tabsheet.TabsheetState.class, new String[] {"immediate", "height", "readOnly", "registeredEventListeners", "primaryStyleName", "description", "resources", "enabled", "caption", "styles", "width", "errorMessage", "id", });
            store.setProperties(com.vaadin.shared.ui.AbstractMediaState.class, new String[] {"sources", "registeredEventListeners", "description", "muted", "enabled", "autoplay", "sourceTypes", "width", "resources", "primaryStyleName", "showControls", "htmlContentAllowed", "height", "id", "altText", "readOnly", "caption", "errorMessage", "styles", "immediate", });
            store.setProperties(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, new String[] {"immediate", "errorMessage", "marginsBitmask", "id", "readOnly", "caption", "styles", "resources", "width", "description", "registeredEventListeners", "childData", "spacing", "primaryStyleName", "height", "enabled", });
            store.setProperties(com.vaadin.shared.MouseEventDetails.class, new String[] {"relativeX", "clientX", "button", "relativeY", "metaKey", "clientY", "type", "shiftKey", "altKey", "ctrlKey", });
            store.setProperties(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class, new String[] {"alignmentBitmask", "expandRatio", });
            store.setProperties(com.vaadin.shared.AbstractFieldState.class, new String[] {"id", "primaryStyleName", "hideErrors", "styles", "modified", "enabled", "tabIndex", "width", "resources", "immediate", "required", "height", "errorMessage", "readOnly", "registeredEventListeners", "propertyReadOnly", "description", "caption", });
            store.setProperties(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, new String[] {"primaryStyleName", "description", "id", "registeredEventListeners", "splitterState", "enabled", "errorMessage", "caption", "secondChild", "immediate", "resources", "firstChild", "height", "readOnly", "styles", "width", });
            store.setProperties(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, new String[] {"pollingInterval", "state", "description", "styles", "immediate", "id", "registeredEventListeners", "errorMessage", "hideErrors", "width", "primaryStyleName", "resources", "tabIndex", "caption", "indeterminate", "readOnly", "propertyReadOnly", "modified", "required", "enabled", "height", });
            store.setProperties(com.vaadin.shared.ui.menubar.MenuBarState.class, new String[] {"resources", "enabled", "caption", "styles", "width", "immediate", "errorMessage", "primaryStyleName", "height", "registeredEventListeners", "id", "readOnly", "description", });
            store.setProperties(com.vaadin.shared.ui.popupview.PopupViewState.class, new String[] {"html", "styles", "height", "registeredEventListeners", "readOnly", "immediate", "enabled", "description", "id", "errorMessage", "hideOnMouseOut", "resources", "caption", "width", "primaryStyleName", });
            store.setProperties(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, new String[] {"height", "width", "text", "inputPrompt", "readOnly", "resources", "description", "propertyReadOnly", "primaryStyleName", "styles", "registeredEventListeners", "errorMessage", "modified", "maxLength", "enabled", "tabIndex", "immediate", "id", "columns", "caption", "required", "hideErrors", });
            store.setProperties(com.vaadin.shared.ui.table.TableState.class, new String[] {"immediate", "modified", "propertyReadOnly", "styles", "registeredEventListeners", "enabled", "tabIndex", "resources", "height", "errorMessage", "hideErrors", "id", "caption", "primaryStyleName", "required", "width", "description", "readOnly", });
            store.setProperties(com.vaadin.shared.ui.flash.FlashState.class, new String[] {"standby", "primaryStyleName", "width", "readOnly", "caption", "description", "id", "codebase", "resources", "errorMessage", "styles", "height", "registeredEventListeners", "embedParams", "alternateText", "archive", "codetype", "enabled", "classId", "immediate", });
            store.setProperties(com.vaadin.shared.ui.tree.TreeState.class, new String[] {"readOnly", "required", "width", "caption", "id", "immediate", "enabled", "description", "errorMessage", "hideErrors", "styles", "resources", "tabIndex", "primaryStyleName", "height", "registeredEventListeners", "propertyReadOnly", "modified", });
            store.setProperties(com.vaadin.shared.ui.link.LinkState.class, new String[] {"immediate", "primaryStyleName", "height", "errorMessage", "resources", "caption", "enabled", "width", "description", "id", "readOnly", "styles", "registeredEventListeners", });
            store.setProperties(com.vaadin.shared.ui.BrowserWindowOpenerState.class, new String[] {"caption", "target", "id", "registeredEventListeners", "description", "height", "enabled", "parameters", "width", "readOnly", "resources", "immediate", "errorMessage", "primaryStyleName", "styles", "uriFragment", "features", });
            load2();
          }
          private void load2() {
            store.setProperties(com.vaadin.shared.ui.button.NativeButtonState.class, new String[] {"height", "clickShortcutKeyCode", "htmlContentAllowed", "readOnly", "resources", "primaryStyleName", "width", "id", "caption", "enabled", "disableOnClick", "description", "styles", "tabIndex", "registeredEventListeners", "immediate", "errorMessage", });
            store.setProperties(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, new String[] {"alternateText", "primaryStyleName", "enabled", "description", "id", "height", "errorMessage", "width", "styles", "readOnly", "caption", "registeredEventListeners", "immediate", "resources", });
            store.setProperties(com.vaadin.shared.ui.treetable.TreeTableState.class, new String[] {"width", "enabled", "readOnly", "height", "resources", "propertyReadOnly", "tabIndex", "errorMessage", "immediate", "primaryStyleName", "modified", "registeredEventListeners", "description", "id", "caption", "hideErrors", "required", "styles", });
            store.setProperties(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, new String[] {"errorMessage", "height", "immediate", "styles", "registeredEventListeners", "caption", "primaryStyleName", "description", "id", "connectorToCssPosition", "resources", "enabled", "readOnly", "width", });
            store.setProperties(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, new String[] {"enabled", "styles", "propertyReadOnly", "errorMessage", "immediate", "caption", "width", "tabIndex", "readOnly", "primaryStyleName", "modified", "registeredEventListeners", "hideErrors", "resources", "required", "description", "height", "id", });
            store.setProperties(com.vaadin.shared.ui.ui.UIState.class, new String[] {"width", "errorMessage", "height", "description", "primaryStyleName", "registeredEventListeners", "styles", "immediate", "tabIndex", "enabled", "caption", "id", "readOnly", "resources", });
            store.setProperties(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class, new String[] {"resources", "enabled", "names", "registeredEventListeners", });
            store.setProperties(com.vaadin.shared.ui.combobox.ComboBoxState.class, new String[] {"description", "caption", "tabIndex", "readOnly", "id", "resources", "hideErrors", "height", "styles", "modified", "enabled", "propertyReadOnly", "required", "width", "registeredEventListeners", "errorMessage", "primaryStyleName", "immediate", });
            store.setProperties(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, new String[] {"immediate", "height", "hideErrors", "errorMessage", "primaryStyleName", "id", "registeredEventListeners", "enabled", "resources", "propertyReadOnly", "required", "tabIndex", "caption", "textFieldEnabled", "width", "modified", "readOnly", "description", "styles", });
            store.setProperties(com.vaadin.shared.ui.embedded.EmbeddedState.class, new String[] {"styles", "resources", "caption", "height", "immediate", "registeredEventListeners", "primaryStyleName", "description", "enabled", "id", "alternateText", "width", "readOnly", "errorMessage", });
            store.setProperties(com.vaadin.shared.ui.image.ImageState.class, new String[] {"enabled", "description", "styles", "immediate", "id", "errorMessage", "width", "primaryStyleName", "caption", "readOnly", "height", "alternateText", "registeredEventListeners", "resources", });
            store.setProperties(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, new String[] {"caption", "templateContents", "styles", "enabled", "resources", "id", "errorMessage", "registeredEventListeners", "height", "immediate", "description", "primaryStyleName", "childLocations", "templateName", "readOnly", "width", });
            store.setProperties(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, new String[] {"description", "caption", "id", "styles", "enabled", "primaryStyleName", "readOnly", "registeredEventListeners", "resources", "firstChild", "secondChild", "height", "splitterState", "width", "errorMessage", "immediate", });
            store.setProperties(com.vaadin.shared.ui.csslayout.CssLayoutState.class, new String[] {"caption", "resources", "immediate", "id", "styles", "height", "description", "errorMessage", "width", "enabled", "primaryStyleName", "readOnly", "childCss", "registeredEventListeners", });
            store.setProperties(com.vaadin.shared.AbstractComponentState.class, new String[] {"height", "resources", "registeredEventListeners", "immediate", "primaryStyleName", "errorMessage", "width", "description", "styles", "enabled", "id", "readOnly", "caption", });
            store.setProperties(com.vaadin.shared.ui.button.ButtonState.class, new String[] {"caption", "readOnly", "styles", "disableOnClick", "errorMessage", "id", "width", "htmlContentAllowed", "clickShortcutKeyCode", "tabIndex", "registeredEventListeners", "enabled", "description", "immediate", "height", "resources", "primaryStyleName", });
            store.setProperties(com.vaadin.shared.ui.window.WindowState.class, new String[] {"primaryStyleName", "draggable", "scrollTop", "positionX", "height", "centered", "positionY", "resizable", "resources", "immediate", "modal", "id", "enabled", "description", "errorMessage", "width", "readOnly", "styles", "resizeLazy", "caption", "registeredEventListeners", "tabIndex", "scrollLeft", });
            store.setProperties(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, new String[] {"resources", "height", "registeredEventListeners", "enabled", "primaryStyleName", "width", "errorMessage", "caption", "marginsBitmask", "id", "readOnly", "columns", "childData", "description", "styles", "spacing", "rows", "immediate", });
            store.setProperties(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, new String[] {"enabled", "readOnly", "required", "description", "propertyReadOnly", "styles", "id", "tabIndex", "width", "hideErrors", "errorMessage", "registeredEventListeners", "height", "immediate", "resources", "caption", "primaryStyleName", "modified", });
            store.setProperties(com.vaadin.shared.ui.video.VideoState.class, new String[] {"width", "htmlContentAllowed", "sources", "altText", "errorMessage", "showControls", "muted", "enabled", "sourceTypes", "styles", "height", "id", "readOnly", "immediate", "description", "resources", "primaryStyleName", "registeredEventListeners", "autoplay", "caption", });
            store.setProperties(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, new String[] {"alignment", "row1", "column2", "row2", "column1", });
            store.setProperties(com.vaadin.shared.ui.checkbox.CheckBoxState.class, new String[] {"checked", "caption", "hideErrors", "propertyReadOnly", "styles", "tabIndex", "enabled", "height", "primaryStyleName", "registeredEventListeners", "required", "readOnly", "resources", "width", "errorMessage", "id", "immediate", "description", "modified", });
            store.setProperties(com.vaadin.shared.ui.textarea.TextAreaState.class, new String[] {"hideErrors", "required", "text", "propertyReadOnly", "caption", "primaryStyleName", "tabIndex", "height", "errorMessage", "immediate", "description", "width", "wordwrap", "columns", "modified", "readOnly", "styles", "resources", "maxLength", "registeredEventListeners", "id", "inputPrompt", "enabled", "rows", });
            store.setProperties(com.vaadin.shared.communication.SharedState.class, new String[] {"resources", "registeredEventListeners", "enabled", });
            store.setProperties(com.vaadin.shared.ui.JavaScriptComponentState.class, new String[] {"width", "caption", "errorMessage", "rpcInterfaces", "primaryStyleName", "id", "styles", "enabled", "readOnly", "callbackNames", "resources", "registeredEventListeners", "description", "immediate", "height", });
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "codebase", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.popupview.PopupViewState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.image.ImageState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "ctrlKey", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "propertyReadOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "connectorToCssPosition", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "rows", new Type(java.lang.Integer.class));
            store.setPropertyType(com.cs.jqchart.gwt.client.shared.JQChartState.class, "clickJS", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "scrollTop", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "alignment", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.button.NativeButtonState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.image.ImageState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.button.NativeButtonState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.JavaScriptExtensionState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "button", new Type(com.vaadin.shared.MouseEventDetails.MouseButton.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "altText", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.video.VideoState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.label.LabelState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.video.VideoState.class, "sources", new Type("java.util.List", new Type[] {new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.JavaScriptComponentState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.image.ImageState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tree.TreeState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.NativeButtonState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.JavaScriptComponentState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "columns", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.NativeButtonState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.treetable.TreeTableState.class, "hideErrors", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "splitterState", new Type(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class));
            store.setPropertyType(com.vaadin.shared.ui.table.TableState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.cs.jqchart.gwt.client.shared.JQChartState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.NativeButtonState.class, "clickShortcutKeyCode", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.menubar.MenuBarState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.JavaScriptComponentState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.tree.TreeState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "required", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "firstChild", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.shared.ui.menubar.MenuBarState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.cs.jqchart.gwt.client.shared.JQChartState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "codetype", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "hideErrors", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.table.TableState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.table.TableState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "spacing", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "text", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "layout", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.label.LabelState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "marginsBitmask", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.popupview.PopupViewState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "positionX", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "positionY", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.NativeButtonState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "required", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.treetable.TreeTableState.class, "modified", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.tree.TreeState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "resolution", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "hideErrors", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.NativeButtonState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.popupview.PopupViewState.class, "hideOnMouseOut", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "altKey", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.tree.TreeState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.video.VideoState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.NativeButtonState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "alternateText", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "propertyReadOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.table.TableState.class, "modified", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "htmlContentAllowed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.image.ImageState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "columns", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "firstChild", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.shared.ui.JavaScriptComponentState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "primaryStyleName", new Type(java.lang.String.class));
            load3();
          }
          private void load3() {
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.label.LabelState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "autoplay", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "required", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.menubar.MenuBarState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "features", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "pollingInterval", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "draggable", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.label.LabelState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.cs.jqchart.gwt.client.shared.JQChartState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.popupview.PopupViewState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.JavaScriptExtensionState.class, "rpcInterfaces", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }), }));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.table.TableState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.tree.TreeState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.table.TableState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "rows", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "muted", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.cs.jqchart.gwt.client.shared.JQChartState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.menubar.MenuBarState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.label.LabelState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.label.LabelState.class, "text", new Type(java.lang.String.class));
            store.setPropertyType(com.cs.jqchart.gwt.client.shared.JQChartState.class, "dataClickJS", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "parameters", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "textFieldEnabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.table.TableState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.JavaScriptComponentState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.popupview.PopupViewState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.popupview.PopupViewState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.label.LabelState.class, "contentMode", new Type(com.vaadin.shared.ui.label.ContentMode.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.tree.TreeState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "clientX", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.image.ImageState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "clientY", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "required", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.tree.TreeState.class, "modified", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "scrollTop", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "required", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "uriFragment", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "childData", new Type("java.util.HashMap", new Type[] {new Type(com.vaadin.shared.Connector.class), new Type(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class), }));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "orientation", new Type(com.vaadin.shared.ui.slider.SliderOrientation.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.treetable.TreeTableState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "modified", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "metaKey", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "inputPrompt", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "required", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.cs.jqchart.gwt.client.shared.JQChartState.class, "refreshJS", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.label.LabelState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "modified", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.popupview.PopupViewState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.JavaScriptExtensionState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "splitterState", new Type(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "modified", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.cs.jqchart.gwt.client.shared.JQChartState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.NativeButtonState.class, "htmlContentAllowed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.video.VideoState.class, "muted", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.table.TableState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.treetable.TreeTableState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "checked", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "centered", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.menubar.MenuBarState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "childData", new Type("java.util.Map", new Type[] {new Type(com.vaadin.shared.Connector.class), new Type(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class), }));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "childCss", new Type("java.util.Map", new Type[] {new Type(com.vaadin.shared.Connector.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "spacing", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.cs.jqchart.gwt.client.shared.JQChartState.class, "initJS", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "required", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.video.VideoState.class, "showControls", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.menubar.MenuBarState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.cs.jqchart.gwt.client.shared.JQChartState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "htmlContentAllowed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "resizeLazy", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "childData", new Type("java.util.HashMap", new Type[] {new Type(com.vaadin.shared.Connector.class), new Type(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class), }));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class, "names", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.video.VideoState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.treetable.TreeTableState.class, "required", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.image.ImageState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "hideErrors", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.tree.TreeState.class, "propertyReadOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.video.VideoState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.popupview.PopupViewState.class, "html", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "marginsBitmask", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.treetable.TreeTableState.class, "propertyReadOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "archive", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.video.VideoState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "value", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "modified", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "positionUnit", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.NativeButtonState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.video.VideoState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.cs.jqchart.gwt.client.shared.JQChartState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.popupview.PopupViewState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.treetable.TreeTableState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "propertyReadOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "secondChild", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "sources", new Type("java.util.List", new Type[] {new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.menubar.MenuBarState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.table.TableState.class, "propertyReadOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.cs.jqchart.gwt.client.shared.JQChartState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.table.TableState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "marginsBitmask", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.treetable.TreeTableState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "childLocations", new Type("java.util.Map", new Type[] {new Type(com.vaadin.shared.Connector.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "classId", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "inputPrompt", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            load4();
          }
          private void load4() {
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "text", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.treetable.TreeTableState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.treetable.TreeTableState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.video.VideoState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "maxValue", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.JavaScriptComponentState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.label.LabelState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.JavaScriptComponentState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.table.TableState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "showControls", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "minValue", new Type(java.lang.Double.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.table.TableState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "state", new Type(java.lang.Float.class));
            store.setPropertyType(com.vaadin.shared.ui.treetable.TreeTableState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "modified", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.button.NativeButtonState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "propertyReadOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.button.NativeButtonState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "standby", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "hideErrors", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.menubar.MenuBarState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "disableOnClick", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.label.LabelState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "modified", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "footer", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "hideErrors", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "modal", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.tree.TreeState.class, "hideErrors", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.image.ImageState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.JavaScriptComponentState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.menubar.MenuBarState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.tree.TreeState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.communication.SharedState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "maxLength", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "modified", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "row1", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "row2", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.image.ImageState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "columns", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "propertyReadOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "minPositionUnit", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "modified", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.treetable.TreeTableState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.NativeButtonState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.video.VideoState.class, "autoplay", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "propertyReadOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.button.NativeButtonState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "maxPositionUnit", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "propertyReadOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.treetable.TreeTableState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.video.VideoState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.label.LabelState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "scrollLeft", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.menubar.MenuBarState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "propertyReadOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "hideErrors", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "maxLength", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.button.NativeButtonState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.image.ImageState.class, "alternateText", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.JavaScriptComponentState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.video.VideoState.class, "sourceTypes", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.popupview.PopupViewState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.label.LabelState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.image.ImageState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tree.TreeState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "target", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "modified", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.label.LabelState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "propertyReadOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "hideErrors", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "alternateText", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "wordwrap", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "propertyReadOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tree.TreeState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "scrollLeft", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "hideErrors", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.tree.TreeState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "shiftKey", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.popupview.PopupViewState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "templateName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class, "expandRatio", new Type(java.lang.Float.class));
            store.setPropertyType(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.JavaScriptComponentState.class, "rpcInterfaces", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }), }));
            store.setPropertyType(com.vaadin.shared.ui.label.LabelState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.video.VideoState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.tree.TreeState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.JavaScriptComponentState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.menubar.MenuBarState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.cs.jqchart.gwt.client.shared.JQChartState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "hideErrors", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.cs.jqchart.gwt.client.shared.JQChartState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.NativeButtonState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "locked", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.menubar.MenuBarState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "errorMessage", new Type(java.lang.String.class));
            load5();
          }
          private void load5() {
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "modified", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "type", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tree.TreeState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.image.ImageState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "required", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "secondChild", new Type(com.vaadin.shared.Connector.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "propertyReadOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.JavaScriptComponentState.class, "callbackNames", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.table.TableState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "templateContents", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.table.TableState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.popupview.PopupViewState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "required", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "marginsBitmask", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.table.TableState.class, "hideErrors", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "spacing", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.treetable.TreeTableState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.button.ButtonState.class, "clickShortcutKeyCode", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.popupview.PopupViewState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "position", new Type(java.lang.Float.class));
            store.setPropertyType(com.vaadin.shared.ui.treetable.TreeTableState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.cs.jqchart.gwt.client.shared.JQChartState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tree.TreeState.class, "required", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.tree.TreeState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "required", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.menubar.MenuBarState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.table.TableState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "alternateText", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "hideErrors", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.treetable.TreeTableState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.cs.jqchart.gwt.client.shared.JQChartState.class, "lastUpdateTime", new Type(java.lang.Long.class));
            store.setPropertyType(com.vaadin.shared.ui.image.ImageState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "positionReversed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.video.VideoState.class, "htmlContentAllowed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.JavaScriptExtensionState.class, "callbackNames", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "hideErrors", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "childData", new Type("java.util.HashMap", new Type[] {new Type(com.vaadin.shared.Connector.class), new Type(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class), }));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "embedParams", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.popupview.PopupViewState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "maxPosition", new Type(java.lang.Float.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.JavaScriptExtensionState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.cs.jqchart.gwt.client.shared.JQChartState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "relativeX", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.MouseEventDetails.class, "relativeY", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.communication.SharedState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.treetable.TreeTableState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.panel.PanelState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.ui.UIState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.cs.jqchart.gwt.client.shared.JQChartState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.table.TableState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "spacing", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.combobox.ComboBoxState.class, "modified", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.video.VideoState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.label.LabelState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.JavaScriptComponentState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "required", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.video.VideoState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.textarea.TextAreaState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "indeterminate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.JavaScriptComponentState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.AbstractComponentState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.slider.SliderState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "propertyReadOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.form.FormState.class, "hideErrors", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.communication.SharedState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.video.VideoState.class, "altText", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class, "alignmentBitmask", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "minPosition", new Type(java.lang.Float.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.embedded.EmbeddedState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.table.TableState.class, "required", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "modified", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.popupview.PopupViewState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.window.WindowState.class, "resizable", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.link.LinkState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "required", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.AbstractMediaState.class, "sourceTypes", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.image.ImageState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "tabIndex", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.image.ImageState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.cs.jqchart.gwt.client.shared.JQChartState.class, "uuid", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "column2", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.video.VideoState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "column1", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.AbstractFieldState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.flash.FlashState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.treetable.TreeTableState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.button.NativeButtonState.class, "disableOnClick", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.JavaScriptComponentState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.tree.TreeState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.video.VideoState.class, "caption", new Type(java.lang.String.class));
            store.setSetter(com.vaadin.shared.ui.flash.FlashState.class, "codebase", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.flash.FlashState) bean).codebase = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.popupview.PopupViewState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.image.ImageState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.image.ImageState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.MouseEventDetails.class, "ctrlKey", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.MouseEventDetails) bean).setCtrlKey((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractFieldState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractFieldState) bean).propertyReadOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "connectorToCssPosition", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).connectorToCssPosition = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "rows", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).rows = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "clickJS", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).clickJS = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "scrollTop", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).scrollTop = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            load6();
          }
          private void load6() {
            store.setSetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractComponentState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractComponentState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "alignment", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData) bean).alignment = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.NativeButtonState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.NativeButtonState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.image.ImageState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.image.ImageState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.NativeButtonState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.NativeButtonState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.panel.PanelState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.panel.PanelState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.JavaScriptExtensionState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.JavaScriptExtensionState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractComponentState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractComponentState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.AbstractMediaState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.AbstractMediaState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.MouseEventDetails.class, "button", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.MouseEventDetails) bean).setButton((com.vaadin.shared.MouseEventDetails.MouseButton) params[0]);
                return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.AbstractMediaState.class, "altText", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.AbstractMediaState) bean).altText = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.panel.PanelState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.panel.PanelState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.video.VideoState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.video.VideoState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.label.LabelState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.label.LabelState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.link.LinkState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.link.LinkState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.video.VideoState.class, "sources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.video.VideoState) bean).sources = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.JavaScriptComponentState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.ButtonState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.ButtonState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.flash.FlashState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.flash.FlashState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.flash.FlashState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.flash.FlashState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.image.ImageState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.image.ImageState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.panel.PanelState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.panel.PanelState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tree.TreeState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tree.TreeState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.NativeButtonState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.NativeButtonState) bean).tabIndex = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.JavaScriptComponentState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "columns", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).columns = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.NativeButtonState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.NativeButtonState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.treetable.TreeTableState) bean).hideErrors = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "splitterState", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).splitterState = (com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.table.TableState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.table.TableState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.flash.FlashState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.flash.FlashState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.form.FormState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.form.FormState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.NativeButtonState.class, "clickShortcutKeyCode", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.NativeButtonState) bean).clickShortcutKeyCode = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.menubar.MenuBarState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.JavaScriptComponentState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.panel.PanelState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.panel.PanelState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tree.TreeState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tree.TreeState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).required = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "firstChild", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).firstChild = (com.vaadin.shared.Connector)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.menubar.MenuBarState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.ButtonState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.ButtonState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.AbstractMediaState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.AbstractMediaState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.form.FormState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.form.FormState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.flash.FlashState.class, "codetype", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.flash.FlashState) bean).codetype = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.ButtonState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.ButtonState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.ui.UIState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.ui.UIState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).hideErrors = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractFieldState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractFieldState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.table.TableState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.table.TableState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.table.TableState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.table.TableState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "spacing", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).spacing = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "text", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).text = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.form.FormState.class, "layout", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.form.FormState) bean).layout = (com.vaadin.shared.Connector)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.ui.UIState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.ui.UIState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).tabIndex = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.label.LabelState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.label.LabelState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "marginsBitmask", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).marginsBitmask = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.popupview.PopupViewState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.link.LinkState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.link.LinkState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "positionX", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).positionX = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "positionY", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).positionY = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            load7();
          }
          private void load7() {
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.NativeButtonState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.NativeButtonState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractFieldState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractFieldState) bean).required = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.treetable.TreeTableState) bean).modified = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tree.TreeState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tree.TreeState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.form.FormState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.form.FormState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "resolution", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).resolution = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).hideErrors = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.NativeButtonState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.NativeButtonState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.AbstractMediaState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.AbstractMediaState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "hideOnMouseOut", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.popupview.PopupViewState) bean).hideOnMouseOut = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.MouseEventDetails.class, "altKey", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.MouseEventDetails) bean).setAltKey((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).tabIndex = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tree.TreeState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tree.TreeState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.video.VideoState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.video.VideoState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.NativeButtonState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.NativeButtonState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "alternateText", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).alternateText = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).propertyReadOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.table.TableState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.table.TableState) bean).modified = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.link.LinkState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.link.LinkState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.ButtonState.class, "htmlContentAllowed", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.ButtonState) bean).htmlContentAllowed = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.image.ImageState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.image.ImageState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "columns", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).columns = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "firstChild", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).firstChild = (com.vaadin.shared.Connector)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.JavaScriptComponentState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.ButtonState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.ButtonState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractFieldState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractFieldState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.label.LabelState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.label.LabelState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.AbstractMediaState.class, "autoplay", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.AbstractMediaState) bean).autoplay = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).required = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.menubar.MenuBarState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "features", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).features = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "pollingInterval", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).pollingInterval = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "draggable", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).draggable = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).tabIndex = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractComponentState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractComponentState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.label.LabelState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.label.LabelState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.ui.UIState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.ui.UIState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.ui.UIState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.ui.UIState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.popupview.PopupViewState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.JavaScriptExtensionState.class, "rpcInterfaces", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.JavaScriptExtensionState) bean).setRpcInterfaces((java.util.Map) params[0]);
                return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.table.TableState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.table.TableState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.flash.FlashState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.flash.FlashState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tree.TreeState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tree.TreeState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.table.TableState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.table.TableState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).tabIndex = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "rows", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).rows = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.AbstractMediaState.class, "muted", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.AbstractMediaState) bean).muted = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.form.FormState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.form.FormState) bean).tabIndex = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.menubar.MenuBarState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.AbstractMediaState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.AbstractMediaState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.label.LabelState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.label.LabelState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.label.LabelState.class, "text", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.label.LabelState) bean).text = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "dataClickJS", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).dataClickJS = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.link.LinkState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.link.LinkState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "parameters", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).parameters = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "textFieldEnabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).textFieldEnabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.table.TableState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.table.TableState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.ButtonState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.ButtonState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.JavaScriptComponentState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.popupview.PopupViewState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.popupview.PopupViewState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.label.LabelState.class, "contentMode", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.label.LabelState) bean).contentMode = (com.vaadin.shared.ui.label.ContentMode)params[0];return null;
              }
            });
            load8();
          }
          private void load8() {
            store.setSetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.AbstractMediaState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.AbstractMediaState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tree.TreeState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tree.TreeState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.MouseEventDetails.class, "clientX", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.MouseEventDetails) bean).setClientX((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.image.ImageState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.image.ImageState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.MouseEventDetails.class, "clientY", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.MouseEventDetails) bean).setClientY((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.form.FormState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.form.FormState) bean).required = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tree.TreeState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tree.TreeState) bean).modified = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.panel.PanelState.class, "scrollTop", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.panel.PanelState) bean).scrollTop = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).tabIndex = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).required = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "uriFragment", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).uriFragment = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "childData", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).childData = (java.util.HashMap)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractComponentState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractComponentState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "orientation", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).orientation = (com.vaadin.shared.ui.slider.SliderOrientation)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).tabIndex = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.flash.FlashState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.flash.FlashState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.panel.PanelState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.panel.PanelState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.treetable.TreeTableState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).modified = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.flash.FlashState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.flash.FlashState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.MouseEventDetails.class, "metaKey", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.MouseEventDetails) bean).setMetaKey((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "inputPrompt", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).inputPrompt = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).required = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.link.LinkState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.link.LinkState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "refreshJS", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).refreshJS = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractFieldState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractFieldState) bean).tabIndex = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.label.LabelState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.label.LabelState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).modified = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.flash.FlashState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.flash.FlashState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.popupview.PopupViewState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.AbstractMediaState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.AbstractMediaState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.form.FormState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.form.FormState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.JavaScriptExtensionState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.JavaScriptExtensionState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "splitterState", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).splitterState = (com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractFieldState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractFieldState) bean).modified = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.NativeButtonState.class, "htmlContentAllowed", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.NativeButtonState) bean).htmlContentAllowed = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.video.VideoState.class, "muted", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.video.VideoState) bean).muted = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractFieldState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractFieldState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.panel.PanelState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.panel.PanelState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.table.TableState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.table.TableState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.treetable.TreeTableState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "checked", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).checked = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "centered", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).centered = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.form.FormState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.form.FormState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractFieldState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractFieldState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.menubar.MenuBarState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "childData", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).childData = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractFieldState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractFieldState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "childCss", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).childCss = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "spacing", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).spacing = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractFieldState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractFieldState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "initJS", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).initJS = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).required = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.video.VideoState.class, "showControls", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.video.VideoState) bean).showControls = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.menubar.MenuBarState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.AbstractMediaState.class, "htmlContentAllowed", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.AbstractMediaState) bean).htmlContentAllowed = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "resizeLazy", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).resizeLazy = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "childData", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).childData = (java.util.HashMap)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class, "names", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState) bean).names = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.video.VideoState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.video.VideoState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.treetable.TreeTableState) bean).required = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.ButtonState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.ButtonState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.AbstractMediaState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.AbstractMediaState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.image.ImageState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.image.ImageState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).hideErrors = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractFieldState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractFieldState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tree.TreeState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tree.TreeState) bean).propertyReadOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.video.VideoState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.video.VideoState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "html", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.popupview.PopupViewState) bean).html = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "marginsBitmask", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).marginsBitmask = (java.lang.Integer)params[0];return null;
              }
            });
            load9();
          }
          private void load9() {
            store.setSetter(com.vaadin.shared.AbstractComponentState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractComponentState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.treetable.TreeTableState) bean).propertyReadOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.ui.UIState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.ui.UIState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.flash.FlashState.class, "archive", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.flash.FlashState) bean).archive = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.video.VideoState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.video.VideoState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "value", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).value = (java.lang.Double)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.form.FormState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.form.FormState) bean).modified = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "positionUnit", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState) bean).positionUnit = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.NativeButtonState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.NativeButtonState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.video.VideoState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.video.VideoState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.popupview.PopupViewState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.treetable.TreeTableState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).propertyReadOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.link.LinkState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.link.LinkState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "secondChild", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).secondChild = (com.vaadin.shared.Connector)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.AbstractMediaState.class, "sources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.AbstractMediaState) bean).sources = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).tabIndex = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.menubar.MenuBarState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.table.TableState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.table.TableState) bean).propertyReadOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractComponentState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractComponentState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.table.TableState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.table.TableState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "marginsBitmask", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).marginsBitmask = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.treetable.TreeTableState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "childLocations", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).childLocations = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.flash.FlashState.class, "classId", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.flash.FlashState) bean).classId = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "inputPrompt", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).inputPrompt = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.ButtonState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.ButtonState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "text", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).text = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.treetable.TreeTableState) bean).tabIndex = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.treetable.TreeTableState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.video.VideoState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.video.VideoState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "maxValue", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).maxValue = (java.lang.Double)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.panel.PanelState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.panel.PanelState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.JavaScriptComponentState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.label.LabelState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.label.LabelState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractFieldState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractFieldState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.JavaScriptComponentState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.table.TableState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.table.TableState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.link.LinkState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.link.LinkState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.AbstractMediaState.class, "showControls", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.AbstractMediaState) bean).showControls = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "minValue", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).minValue = (java.lang.Double)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.table.TableState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.table.TableState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.ButtonState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.ButtonState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "state", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).state = (java.lang.Float)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.treetable.TreeTableState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.AbstractMediaState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.AbstractMediaState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).modified = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.NativeButtonState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.NativeButtonState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).propertyReadOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.NativeButtonState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.NativeButtonState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.ui.UIState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.ui.UIState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.flash.FlashState.class, "standby", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.flash.FlashState) bean).standby = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.panel.PanelState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.panel.PanelState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).hideErrors = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.form.FormState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.form.FormState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).tabIndex = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractComponentState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractComponentState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.menubar.MenuBarState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.ButtonState.class, "disableOnClick", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.ButtonState) bean).disableOnClick = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.label.LabelState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.label.LabelState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).modified = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.panel.PanelState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.panel.PanelState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.ButtonState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.ButtonState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.form.FormState.class, "footer", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.form.FormState) bean).footer = (com.vaadin.shared.Connector)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            load10();
          }
          private void load10() {
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractFieldState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractFieldState) bean).hideErrors = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "modal", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).modal = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tree.TreeState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tree.TreeState) bean).hideErrors = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.image.ImageState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.image.ImageState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.ui.UIState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.ui.UIState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.ButtonState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.ButtonState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.JavaScriptComponentState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.menubar.MenuBarState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tree.TreeState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tree.TreeState) bean).tabIndex = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.communication.SharedState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.communication.SharedState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.panel.PanelState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.panel.PanelState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "maxLength", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).maxLength = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.flash.FlashState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.flash.FlashState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).modified = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "row1", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData) bean).row1 = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "row2", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData) bean).row2 = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractComponentState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractComponentState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.image.ImageState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.image.ImageState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "columns", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).columns = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).propertyReadOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "minPositionUnit", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState) bean).minPositionUnit = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.link.LinkState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.link.LinkState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).modified = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.form.FormState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.form.FormState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.link.LinkState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.link.LinkState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.ui.UIState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.ui.UIState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.treetable.TreeTableState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.AbstractMediaState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.AbstractMediaState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.NativeButtonState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.NativeButtonState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.video.VideoState.class, "autoplay", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.video.VideoState) bean).autoplay = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).propertyReadOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.NativeButtonState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.NativeButtonState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractFieldState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractFieldState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "maxPositionUnit", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState) bean).maxPositionUnit = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.ui.UIState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.ui.UIState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).propertyReadOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.treetable.TreeTableState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.ButtonState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.ButtonState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.video.VideoState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.video.VideoState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.label.LabelState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.label.LabelState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.AbstractMediaState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.AbstractMediaState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "scrollLeft", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).scrollLeft = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.menubar.MenuBarState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).propertyReadOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).hideErrors = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "maxLength", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).maxLength = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.form.FormState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.form.FormState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.NativeButtonState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.NativeButtonState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.image.ImageState.class, "alternateText", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.image.ImageState) bean).alternateText = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.ui.UIState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.ui.UIState) bean).tabIndex = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.JavaScriptComponentState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).tabIndex = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.video.VideoState.class, "sourceTypes", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.video.VideoState) bean).sourceTypes = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.popupview.PopupViewState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.label.LabelState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.label.LabelState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.image.ImageState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.image.ImageState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tree.TreeState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tree.TreeState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "target", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).target = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).modified = (java.lang.Boolean)params[0];return null;
              }
            });
            load11();
          }
          private void load11() {
            store.setSetter(com.vaadin.shared.ui.label.LabelState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.label.LabelState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).propertyReadOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).hideErrors = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.flash.FlashState.class, "alternateText", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.flash.FlashState) bean).alternateText = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "wordwrap", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).wordwrap = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).propertyReadOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tree.TreeState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tree.TreeState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.panel.PanelState.class, "scrollLeft", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.panel.PanelState) bean).scrollLeft = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).hideErrors = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tree.TreeState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tree.TreeState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.MouseEventDetails.class, "shiftKey", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.MouseEventDetails) bean).setShiftKey((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.link.LinkState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.link.LinkState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.popupview.PopupViewState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "templateName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).templateName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class, "expandRatio", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData) bean).expandRatio = (java.lang.Float)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "rpcInterfaces", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.JavaScriptComponentState) bean).setRpcInterfaces((java.util.Map) params[0]);
                return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.label.LabelState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.label.LabelState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.ui.UIState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.ui.UIState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.video.VideoState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.video.VideoState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tree.TreeState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tree.TreeState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.JavaScriptComponentState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractFieldState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractFieldState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.menubar.MenuBarState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.form.FormState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.form.FormState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.form.FormState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.form.FormState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).hideErrors = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.NativeButtonState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.NativeButtonState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.flash.FlashState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.flash.FlashState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "locked", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState) bean).locked = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.menubar.MenuBarState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.ButtonState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.ButtonState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).modified = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.MouseEventDetails.class, "type", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.MouseEventDetails) bean).setType((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tree.TreeState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tree.TreeState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.image.ImageState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.image.ImageState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.ButtonState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.ButtonState) bean).tabIndex = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.form.FormState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.form.FormState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).required = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractComponentState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractComponentState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "secondChild", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).secondChild = (com.vaadin.shared.Connector)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.ui.UIState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.ui.UIState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.form.FormState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.form.FormState) bean).propertyReadOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "callbackNames", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.JavaScriptComponentState) bean).setCallbackNames((java.util.Set) params[0]);
                return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.table.TableState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.table.TableState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.ButtonState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.ButtonState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "templateContents", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).templateContents = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.flash.FlashState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.flash.FlashState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.form.FormState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.form.FormState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.table.TableState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.table.TableState) bean).tabIndex = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.popupview.PopupViewState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.panel.PanelState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.panel.PanelState) bean).tabIndex = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).required = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "marginsBitmask", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).marginsBitmask = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.table.TableState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.table.TableState) bean).hideErrors = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "spacing", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).spacing = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractFieldState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractFieldState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.treetable.TreeTableState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.ButtonState.class, "clickShortcutKeyCode", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.ButtonState) bean).clickShortcutKeyCode = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.panel.PanelState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.panel.PanelState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.popupview.PopupViewState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "position", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState) bean).position = (java.lang.Float)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.treetable.TreeTableState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            load12();
          }
          private void load12() {
            store.setSetter(com.vaadin.shared.ui.tree.TreeState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tree.TreeState) bean).required = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tree.TreeState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tree.TreeState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.link.LinkState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.link.LinkState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).required = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.menubar.MenuBarState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.table.TableState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.table.TableState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "alternateText", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).alternateText = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).hideErrors = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.treetable.TreeTableState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "lastUpdateTime", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).lastUpdateTime = (java.lang.Long)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.image.ImageState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.image.ImageState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractFieldState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractFieldState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractComponentState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractComponentState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "positionReversed", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState) bean).positionReversed = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.video.VideoState.class, "htmlContentAllowed", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.video.VideoState) bean).htmlContentAllowed = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.JavaScriptExtensionState.class, "callbackNames", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.JavaScriptExtensionState) bean).setCallbackNames((java.util.Set) params[0]);
                return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).hideErrors = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "childData", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).childData = (java.util.HashMap)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.flash.FlashState.class, "embedParams", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.flash.FlashState) bean).embedParams = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.popupview.PopupViewState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "maxPosition", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState) bean).maxPosition = (java.lang.Float)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.JavaScriptExtensionState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.JavaScriptExtensionState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.flash.FlashState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.flash.FlashState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.panel.PanelState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.panel.PanelState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.flash.FlashState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.flash.FlashState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.MouseEventDetails.class, "relativeX", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.MouseEventDetails) bean).setRelativeX((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setSetter(com.vaadin.shared.MouseEventDetails.class, "relativeY", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.MouseEventDetails) bean).setRelativeY((java.lang.Integer) params[0]);
                return null;
              }
            });
            store.setSetter(com.vaadin.shared.communication.SharedState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.communication.SharedState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.treetable.TreeTableState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.panel.PanelState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.panel.PanelState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.ui.UIState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.ui.UIState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.ui.UIState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.ui.UIState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.link.LinkState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.link.LinkState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.table.TableState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.table.TableState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.form.FormState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.form.FormState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "spacing", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).spacing = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).modified = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.AbstractMediaState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.AbstractMediaState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.video.VideoState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.video.VideoState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.label.LabelState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.label.LabelState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.AbstractMediaState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.AbstractMediaState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.JavaScriptComponentState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).required = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.video.VideoState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.video.VideoState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractComponentState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractComponentState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.textarea.TextAreaState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractComponentState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractComponentState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "indeterminate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).indeterminate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.JavaScriptComponentState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractComponentState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractComponentState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.slider.SliderState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.slider.SliderState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).propertyReadOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.form.FormState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.form.FormState) bean).hideErrors = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.communication.SharedState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.communication.SharedState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.video.VideoState.class, "altText", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.video.VideoState) bean).altText = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class, "alignmentBitmask", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData) bean).alignmentBitmask = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "minPosition", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState) bean).minPosition = (java.lang.Float)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.AbstractMediaState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.AbstractMediaState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.table.TableState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.table.TableState) bean).required = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).tabIndex = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).modified = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.popupview.PopupViewState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.window.WindowState.class, "resizable", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.window.WindowState) bean).resizable = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.link.LinkState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.link.LinkState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            load13();
          }
          private void load13() {
            store.setSetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).required = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.AbstractMediaState.class, "sourceTypes", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.AbstractMediaState) bean).sourceTypes = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.image.ImageState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.image.ImageState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).tabIndex = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.image.ImageState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.image.ImageState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "uuid", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).uuid = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "column2", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData) bean).column2 = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.video.VideoState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.video.VideoState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "column1", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData) bean).column1 = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.AbstractFieldState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.AbstractFieldState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.flash.FlashState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.flash.FlashState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.treetable.TreeTableState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.button.NativeButtonState.class, "disableOnClick", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.button.NativeButtonState) bean).disableOnClick = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.JavaScriptComponentState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.tree.TreeState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.tree.TreeState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.video.VideoState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.video.VideoState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setGetter(com.vaadin.shared.ui.flash.FlashState.class, "codebase", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.flash.FlashState) bean).codebase;
              }
            });
            store.setGetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.popupview.PopupViewState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.image.ImageState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.image.ImageState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.MouseEventDetails.class, "ctrlKey", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.MouseEventDetails) bean).isCtrlKey();
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractFieldState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractFieldState) bean).propertyReadOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "connectorToCssPosition", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).connectorToCssPosition;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "rows", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).rows;
              }
            });
            store.setGetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "clickJS", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).clickJS;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "scrollTop", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).scrollTop;
              }
            });
            store.setGetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractComponentState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractComponentState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "alignment", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData) bean).alignment;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.NativeButtonState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.NativeButtonState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.image.ImageState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.image.ImageState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.NativeButtonState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.NativeButtonState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.panel.PanelState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.panel.PanelState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.JavaScriptExtensionState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.JavaScriptExtensionState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractComponentState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractComponentState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.AbstractMediaState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.AbstractMediaState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.MouseEventDetails.class, "button", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.MouseEventDetails) bean).getButton();
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.AbstractMediaState.class, "altText", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.AbstractMediaState) bean).altText;
              }
            });
            store.setGetter(com.vaadin.shared.ui.panel.PanelState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.panel.PanelState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.video.VideoState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.video.VideoState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.label.LabelState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.label.LabelState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.link.LinkState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.link.LinkState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.video.VideoState.class, "sources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.video.VideoState) bean).sources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.JavaScriptComponentState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.ButtonState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.ButtonState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.flash.FlashState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.flash.FlashState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.flash.FlashState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.flash.FlashState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.image.ImageState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.image.ImageState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.panel.PanelState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.panel.PanelState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tree.TreeState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tree.TreeState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.NativeButtonState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.NativeButtonState) bean).tabIndex;
              }
            });
            store.setGetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.JavaScriptComponentState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "columns", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).columns;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.NativeButtonState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.NativeButtonState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.treetable.TreeTableState) bean).hideErrors;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "splitterState", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).splitterState;
              }
            });
            store.setGetter(com.vaadin.shared.ui.table.TableState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.table.TableState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.flash.FlashState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.flash.FlashState) bean).readOnly;
              }
            });
            store.setGetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.form.FormState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.form.FormState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.NativeButtonState.class, "clickShortcutKeyCode", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.NativeButtonState) bean).clickShortcutKeyCode;
              }
            });
            store.setGetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.menubar.MenuBarState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.JavaScriptComponentState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.panel.PanelState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.panel.PanelState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tree.TreeState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tree.TreeState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).required;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "firstChild", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).firstChild;
              }
            });
            store.setGetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.menubar.MenuBarState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.ButtonState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.ButtonState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.AbstractMediaState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.AbstractMediaState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).width;
              }
            });
            store.setGetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).id;
              }
            });
            load14();
          }
          private void load14() {
            store.setGetter(com.vaadin.shared.ui.form.FormState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.form.FormState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.flash.FlashState.class, "codetype", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.flash.FlashState) bean).codetype;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.ButtonState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.ButtonState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.ui.UIState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.ui.UIState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).hideErrors;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractFieldState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractFieldState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.table.TableState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.table.TableState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.table.TableState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.table.TableState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "spacing", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).spacing;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "text", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).text;
              }
            });
            store.setGetter(com.vaadin.shared.ui.form.FormState.class, "layout", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.form.FormState) bean).layout;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.ui.UIState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.ui.UIState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).tabIndex;
              }
            });
            store.setGetter(com.vaadin.shared.ui.label.LabelState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.label.LabelState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "marginsBitmask", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).marginsBitmask;
              }
            });
            store.setGetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.popupview.PopupViewState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.link.LinkState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.link.LinkState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "positionX", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).positionX;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "positionY", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).positionY;
              }
            });
            store.setGetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.NativeButtonState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.NativeButtonState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractFieldState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractFieldState) bean).required;
              }
            });
            store.setGetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.treetable.TreeTableState) bean).modified;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tree.TreeState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tree.TreeState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.form.FormState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.form.FormState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "resolution", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).resolution;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).hideErrors;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.NativeButtonState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.NativeButtonState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.AbstractMediaState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.AbstractMediaState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "hideOnMouseOut", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.popupview.PopupViewState) bean).hideOnMouseOut;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.MouseEventDetails.class, "altKey", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.MouseEventDetails) bean).isAltKey();
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).tabIndex;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tree.TreeState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tree.TreeState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.video.VideoState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.video.VideoState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.NativeButtonState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.NativeButtonState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "alternateText", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).alternateText;
              }
            });
            store.setGetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).propertyReadOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.table.TableState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.table.TableState) bean).modified;
              }
            });
            store.setGetter(com.vaadin.shared.ui.link.LinkState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.link.LinkState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.ButtonState.class, "htmlContentAllowed", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.ButtonState) bean).htmlContentAllowed;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.image.ImageState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.image.ImageState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "columns", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).columns;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "firstChild", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).firstChild;
              }
            });
            store.setGetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.JavaScriptComponentState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.ButtonState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.ButtonState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractFieldState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractFieldState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.label.LabelState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.label.LabelState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.AbstractMediaState.class, "autoplay", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.AbstractMediaState) bean).autoplay;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).required;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.menubar.MenuBarState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "features", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).features;
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "pollingInterval", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).pollingInterval;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "draggable", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).draggable;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).tabIndex;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractComponentState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractComponentState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.label.LabelState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.label.LabelState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).styles;
              }
            });
            store.setGetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.ui.UIState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.ui.UIState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.ui.UIState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.ui.UIState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.popupview.PopupViewState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.JavaScriptExtensionState.class, "rpcInterfaces", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.JavaScriptExtensionState) bean).getRpcInterfaces();
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.table.TableState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.table.TableState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.flash.FlashState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.flash.FlashState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tree.TreeState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tree.TreeState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.table.TableState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.table.TableState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).tabIndex;
              }
            });
            store.setGetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "rows", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).rows;
              }
            });
            store.setGetter(com.vaadin.shared.ui.AbstractMediaState.class, "muted", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.AbstractMediaState) bean).muted;
              }
            });
            store.setGetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).height;
              }
            });
            load15();
          }
          private void load15() {
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.form.FormState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.form.FormState) bean).tabIndex;
              }
            });
            store.setGetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.menubar.MenuBarState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.AbstractMediaState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.AbstractMediaState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.label.LabelState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.label.LabelState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.label.LabelState.class, "text", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.label.LabelState) bean).text;
              }
            });
            store.setGetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "dataClickJS", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).dataClickJS;
              }
            });
            store.setGetter(com.vaadin.shared.ui.link.LinkState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.link.LinkState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "parameters", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).parameters;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "textFieldEnabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).textFieldEnabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.table.TableState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.table.TableState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.ButtonState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.ButtonState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.JavaScriptComponentState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.popupview.PopupViewState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.popupview.PopupViewState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.label.LabelState.class, "contentMode", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.label.LabelState) bean).contentMode;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.AbstractMediaState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.AbstractMediaState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tree.TreeState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tree.TreeState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.MouseEventDetails.class, "clientX", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.MouseEventDetails) bean).getClientX();
              }
            });
            store.setGetter(com.vaadin.shared.ui.image.ImageState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.image.ImageState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.MouseEventDetails.class, "clientY", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.MouseEventDetails) bean).getClientY();
              }
            });
            store.setGetter(com.vaadin.shared.ui.form.FormState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.form.FormState) bean).required;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tree.TreeState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tree.TreeState) bean).modified;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.panel.PanelState.class, "scrollTop", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.panel.PanelState) bean).scrollTop;
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).tabIndex;
              }
            });
            store.setGetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).required;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "uriFragment", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).uriFragment;
              }
            });
            store.setGetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "childData", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).childData;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractComponentState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractComponentState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "orientation", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).orientation;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).tabIndex;
              }
            });
            store.setGetter(com.vaadin.shared.ui.flash.FlashState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.flash.FlashState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.panel.PanelState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.panel.PanelState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.treetable.TreeTableState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).modified;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.flash.FlashState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.flash.FlashState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.MouseEventDetails.class, "metaKey", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.MouseEventDetails) bean).isMetaKey();
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "inputPrompt", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).inputPrompt;
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).required;
              }
            });
            store.setGetter(com.vaadin.shared.ui.link.LinkState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.link.LinkState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "refreshJS", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).refreshJS;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractFieldState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractFieldState) bean).tabIndex;
              }
            });
            store.setGetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.label.LabelState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.label.LabelState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).modified;
              }
            });
            store.setGetter(com.vaadin.shared.ui.flash.FlashState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.flash.FlashState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.popupview.PopupViewState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.AbstractMediaState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.AbstractMediaState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.form.FormState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.form.FormState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.JavaScriptExtensionState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.JavaScriptExtensionState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "splitterState", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).splitterState;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractFieldState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractFieldState) bean).modified;
              }
            });
            store.setGetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.NativeButtonState.class, "htmlContentAllowed", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.NativeButtonState) bean).htmlContentAllowed;
              }
            });
            store.setGetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.video.VideoState.class, "muted", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.video.VideoState) bean).muted;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractFieldState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractFieldState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.panel.PanelState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.panel.PanelState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.table.TableState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.table.TableState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.treetable.TreeTableState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "checked", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).checked;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "centered", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).centered;
              }
            });
            store.setGetter(com.vaadin.shared.ui.form.FormState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.form.FormState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractFieldState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractFieldState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.menubar.MenuBarState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "childData", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).childData;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractFieldState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractFieldState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "childCss", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).childCss;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "spacing", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).spacing;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractFieldState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractFieldState) bean).caption;
              }
            });
            store.setGetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "initJS", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).initJS;
              }
            });
            store.setGetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).required;
              }
            });
            store.setGetter(com.vaadin.shared.ui.video.VideoState.class, "showControls", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.video.VideoState) bean).showControls;
              }
            });
            store.setGetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.menubar.MenuBarState) bean).width;
              }
            });
            store.setGetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.AbstractMediaState.class, "htmlContentAllowed", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.AbstractMediaState) bean).htmlContentAllowed;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "resizeLazy", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).resizeLazy;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "childData", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).childData;
              }
            });
            store.setGetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class, "names", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState) bean).names;
              }
            });
            store.setGetter(com.vaadin.shared.ui.video.VideoState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.video.VideoState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.treetable.TreeTableState) bean).required;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.ButtonState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.ButtonState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.AbstractMediaState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.AbstractMediaState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.image.ImageState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.image.ImageState) bean).enabled;
              }
            });
            load16();
          }
          private void load16() {
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).hideErrors;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractFieldState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractFieldState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tree.TreeState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tree.TreeState) bean).propertyReadOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.video.VideoState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.video.VideoState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "html", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.popupview.PopupViewState) bean).html;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "marginsBitmask", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).marginsBitmask;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractComponentState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractComponentState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.treetable.TreeTableState) bean).propertyReadOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.ui.UIState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.ui.UIState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.flash.FlashState.class, "archive", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.flash.FlashState) bean).archive;
              }
            });
            store.setGetter(com.vaadin.shared.ui.video.VideoState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.video.VideoState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "value", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).value;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.form.FormState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.form.FormState) bean).modified;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "positionUnit", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState) bean).positionUnit;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.NativeButtonState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.NativeButtonState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.video.VideoState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.video.VideoState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.popupview.PopupViewState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.treetable.TreeTableState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).propertyReadOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.link.LinkState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.link.LinkState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "secondChild", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).secondChild;
              }
            });
            store.setGetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.AbstractMediaState.class, "sources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.AbstractMediaState) bean).sources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).tabIndex;
              }
            });
            store.setGetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.menubar.MenuBarState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.table.TableState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.table.TableState) bean).propertyReadOnly;
              }
            });
            store.setGetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractComponentState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractComponentState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.table.TableState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.table.TableState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "marginsBitmask", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).marginsBitmask;
              }
            });
            store.setGetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.treetable.TreeTableState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "childLocations", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).childLocations;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.flash.FlashState.class, "classId", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.flash.FlashState) bean).classId;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "inputPrompt", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).inputPrompt;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.ButtonState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.ButtonState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "text", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).text;
              }
            });
            store.setGetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.treetable.TreeTableState) bean).tabIndex;
              }
            });
            store.setGetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.treetable.TreeTableState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.video.VideoState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.video.VideoState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "maxValue", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).maxValue;
              }
            });
            store.setGetter(com.vaadin.shared.ui.panel.PanelState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.panel.PanelState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.JavaScriptComponentState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.label.LabelState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.label.LabelState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractFieldState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractFieldState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.JavaScriptComponentState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.table.TableState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.table.TableState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.link.LinkState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.link.LinkState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.AbstractMediaState.class, "showControls", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.AbstractMediaState) bean).showControls;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "minValue", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).minValue;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.table.TableState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.table.TableState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.ButtonState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.ButtonState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "state", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).state;
              }
            });
            store.setGetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.treetable.TreeTableState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.AbstractMediaState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.AbstractMediaState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).modified;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.NativeButtonState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.NativeButtonState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).propertyReadOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.NativeButtonState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.NativeButtonState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.ui.UIState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.ui.UIState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.flash.FlashState.class, "standby", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.flash.FlashState) bean).standby;
              }
            });
            store.setGetter(com.vaadin.shared.ui.panel.PanelState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.panel.PanelState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).hideErrors;
              }
            });
            store.setGetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.form.FormState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.form.FormState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).tabIndex;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractComponentState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractComponentState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.menubar.MenuBarState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.ButtonState.class, "disableOnClick", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.ButtonState) bean).disableOnClick;
              }
            });
            store.setGetter(com.vaadin.shared.ui.label.LabelState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.label.LabelState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).modified;
              }
            });
            store.setGetter(com.vaadin.shared.ui.panel.PanelState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.panel.PanelState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.ButtonState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.ButtonState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.form.FormState.class, "footer", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.form.FormState) bean).footer;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractFieldState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractFieldState) bean).hideErrors;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "modal", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).modal;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tree.TreeState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tree.TreeState) bean).hideErrors;
              }
            });
            load17();
          }
          private void load17() {
            store.setGetter(com.vaadin.shared.ui.image.ImageState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.image.ImageState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.ui.UIState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.ui.UIState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.ButtonState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.ButtonState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.JavaScriptComponentState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.menubar.MenuBarState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tree.TreeState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tree.TreeState) bean).tabIndex;
              }
            });
            store.setGetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.communication.SharedState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.communication.SharedState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.panel.PanelState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.panel.PanelState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "maxLength", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).maxLength;
              }
            });
            store.setGetter(com.vaadin.shared.ui.flash.FlashState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.flash.FlashState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).modified;
              }
            });
            store.setGetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "row1", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData) bean).row1;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "row2", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData) bean).row2;
              }
            });
            store.setGetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractComponentState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractComponentState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.image.ImageState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.image.ImageState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "columns", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).columns;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).propertyReadOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "minPositionUnit", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState) bean).minPositionUnit;
              }
            });
            store.setGetter(com.vaadin.shared.ui.link.LinkState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.link.LinkState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).modified;
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.form.FormState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.form.FormState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.link.LinkState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.link.LinkState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.ui.UIState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.ui.UIState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.treetable.TreeTableState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.AbstractMediaState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.AbstractMediaState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.NativeButtonState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.NativeButtonState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.video.VideoState.class, "autoplay", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.video.VideoState) bean).autoplay;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).propertyReadOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.NativeButtonState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.NativeButtonState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractFieldState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractFieldState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "maxPositionUnit", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState) bean).maxPositionUnit;
              }
            });
            store.setGetter(com.vaadin.shared.ui.ui.UIState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.ui.UIState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).propertyReadOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.treetable.TreeTableState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.ButtonState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.ButtonState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.video.VideoState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.video.VideoState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.label.LabelState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.label.LabelState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.AbstractMediaState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.AbstractMediaState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "scrollLeft", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).scrollLeft;
              }
            });
            store.setGetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.menubar.MenuBarState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).propertyReadOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).hideErrors;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "maxLength", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).maxLength;
              }
            });
            store.setGetter(com.vaadin.shared.ui.form.FormState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.form.FormState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.NativeButtonState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.NativeButtonState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.image.ImageState.class, "alternateText", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.image.ImageState) bean).alternateText;
              }
            });
            store.setGetter(com.vaadin.shared.ui.ui.UIState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.ui.UIState) bean).tabIndex;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.JavaScriptComponentState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).tabIndex;
              }
            });
            store.setGetter(com.vaadin.shared.ui.video.VideoState.class, "sourceTypes", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.video.VideoState) bean).sourceTypes;
              }
            });
            store.setGetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.popupview.PopupViewState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.label.LabelState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.label.LabelState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.image.ImageState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.image.ImageState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tree.TreeState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tree.TreeState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "target", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).target;
              }
            });
            store.setGetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).modified;
              }
            });
            store.setGetter(com.vaadin.shared.ui.label.LabelState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.label.LabelState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).propertyReadOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).hideErrors;
              }
            });
            store.setGetter(com.vaadin.shared.ui.flash.FlashState.class, "alternateText", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.flash.FlashState) bean).alternateText;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "wordwrap", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).wordwrap;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).propertyReadOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tree.TreeState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tree.TreeState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.panel.PanelState.class, "scrollLeft", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.panel.PanelState) bean).scrollLeft;
              }
            });
            store.setGetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).hideErrors;
              }
            });
            store.setGetter(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tree.TreeState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tree.TreeState) bean).caption;
              }
            });
            load18();
          }
          private void load18() {
            store.setGetter(com.vaadin.shared.MouseEventDetails.class, "shiftKey", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.MouseEventDetails) bean).isShiftKey();
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.link.LinkState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.link.LinkState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.popupview.PopupViewState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "templateName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).templateName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class, "expandRatio", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData) bean).expandRatio;
              }
            });
            store.setGetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "rpcInterfaces", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.JavaScriptComponentState) bean).getRpcInterfaces();
              }
            });
            store.setGetter(com.vaadin.shared.ui.label.LabelState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.label.LabelState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.ui.UIState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.ui.UIState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.video.VideoState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.video.VideoState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tree.TreeState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tree.TreeState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.JavaScriptComponentState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractFieldState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractFieldState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.menubar.MenuBarState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.form.FormState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.form.FormState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.form.FormState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.form.FormState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).hideErrors;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).description;
              }
            });
            store.setGetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.NativeButtonState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.NativeButtonState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.flash.FlashState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.flash.FlashState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "locked", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState) bean).locked;
              }
            });
            store.setGetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.menubar.MenuBarState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.ButtonState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.ButtonState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).modified;
              }
            });
            store.setGetter(com.vaadin.shared.MouseEventDetails.class, "type", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.MouseEventDetails) bean).getType();
              }
            });
            store.setGetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tree.TreeState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tree.TreeState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.image.ImageState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.image.ImageState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.ButtonState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.ButtonState) bean).tabIndex;
              }
            });
            store.setGetter(com.vaadin.shared.ui.form.FormState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.form.FormState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).required;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractComponentState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractComponentState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "secondChild", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).secondChild;
              }
            });
            store.setGetter(com.vaadin.shared.ui.ui.UIState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.ui.UIState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.form.FormState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.form.FormState) bean).propertyReadOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "callbackNames", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.JavaScriptComponentState) bean).getCallbackNames();
              }
            });
            store.setGetter(com.vaadin.shared.ui.table.TableState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.table.TableState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.ButtonState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.ButtonState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "templateContents", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).templateContents;
              }
            });
            store.setGetter(com.vaadin.shared.ui.flash.FlashState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.flash.FlashState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.form.FormState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.form.FormState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.table.TableState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.table.TableState) bean).tabIndex;
              }
            });
            store.setGetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.popupview.PopupViewState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.panel.PanelState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.panel.PanelState) bean).tabIndex;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).required;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "marginsBitmask", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).marginsBitmask;
              }
            });
            store.setGetter(com.vaadin.shared.ui.table.TableState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.table.TableState) bean).hideErrors;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "spacing", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).spacing;
              }
            });
            store.setGetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractFieldState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractFieldState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.treetable.TreeTableState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.ButtonState.class, "clickShortcutKeyCode", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.ButtonState) bean).clickShortcutKeyCode;
              }
            });
            store.setGetter(com.vaadin.shared.ui.panel.PanelState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.panel.PanelState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.popupview.PopupViewState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "position", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState) bean).position;
              }
            });
            store.setGetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.treetable.TreeTableState) bean).styles;
              }
            });
            store.setGetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tree.TreeState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tree.TreeState) bean).required;
              }
            });
            store.setGetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tree.TreeState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tree.TreeState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.link.LinkState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.link.LinkState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).required;
              }
            });
            store.setGetter(com.vaadin.shared.ui.menubar.MenuBarState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.menubar.MenuBarState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.table.TableState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.table.TableState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "alternateText", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).alternateText;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).hideErrors;
              }
            });
            store.setGetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.treetable.TreeTableState) bean).readOnly;
              }
            });
            store.setGetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "lastUpdateTime", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).lastUpdateTime;
              }
            });
            store.setGetter(com.vaadin.shared.ui.image.ImageState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.image.ImageState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractFieldState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractFieldState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.BrowserWindowOpenerState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.BrowserWindowOpenerState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractComponentState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractComponentState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "positionReversed", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState) bean).positionReversed;
              }
            });
            store.setGetter(com.vaadin.shared.ui.video.VideoState.class, "htmlContentAllowed", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.video.VideoState) bean).htmlContentAllowed;
              }
            });
            store.setGetter(com.vaadin.shared.JavaScriptExtensionState.class, "callbackNames", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.JavaScriptExtensionState) bean).getCallbackNames();
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).hideErrors;
              }
            });
            store.setGetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "childData", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).childData;
              }
            });
            store.setGetter(com.vaadin.shared.ui.flash.FlashState.class, "embedParams", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.flash.FlashState) bean).embedParams;
              }
            });
            store.setGetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).enabled;
              }
            });
            load19();
          }
          private void load19() {
            store.setGetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.popupview.PopupViewState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.extension.javascriptmanager.JavaScriptManagerState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tabsheet.TabsheetState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tabsheet.TabsheetState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "maxPosition", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState) bean).maxPosition;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.JavaScriptExtensionState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.JavaScriptExtensionState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.flash.FlashState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.flash.FlashState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).height;
              }
            });
            store.setGetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.panel.PanelState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.panel.PanelState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.flash.FlashState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.flash.FlashState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textfield.AbstractTextFieldState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textfield.AbstractTextFieldState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.MouseEventDetails.class, "relativeX", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.MouseEventDetails) bean).getRelativeX();
              }
            });
            store.setGetter(com.vaadin.shared.MouseEventDetails.class, "relativeY", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.MouseEventDetails) bean).getRelativeY();
              }
            });
            store.setGetter(com.vaadin.shared.communication.SharedState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.communication.SharedState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.treetable.TreeTableState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.panel.PanelState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.panel.PanelState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.customlayout.CustomLayoutState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.customlayout.CustomLayoutState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.csslayout.CssLayoutState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.csslayout.CssLayoutState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.ui.UIState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.ui.UIState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.ui.UIState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.ui.UIState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.link.LinkState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.link.LinkState) bean).height;
              }
            });
            store.setGetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.table.TableState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.table.TableState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.form.FormState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.form.FormState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "spacing", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).spacing;
              }
            });
            store.setGetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.combobox.ComboBoxState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.combobox.ComboBoxState) bean).modified;
              }
            });
            store.setGetter(com.vaadin.shared.ui.AbstractMediaState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.AbstractMediaState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.video.VideoState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.video.VideoState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.label.LabelState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.label.LabelState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.AbstractMediaState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.AbstractMediaState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.JavaScriptComponentState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).required;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.video.VideoState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.video.VideoState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.InlineDateFieldState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.InlineDateFieldState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractComponentState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractComponentState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.textarea.TextAreaState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.textarea.TextAreaState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractComponentState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractComponentState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "indeterminate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).indeterminate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.JavaScriptComponentState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractComponentState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractComponentState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.slider.SliderState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.slider.SliderState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "propertyReadOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).propertyReadOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.form.FormState.class, "hideErrors", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.form.FormState) bean).hideErrors;
              }
            });
            store.setGetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.communication.SharedState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.communication.SharedState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.video.VideoState.class, "altText", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.video.VideoState) bean).altText;
              }
            });
            store.setGetter(com.vaadin.shared.ui.datefield.PopupDateFieldState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.datefield.PopupDateFieldState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData.class, "alignmentBitmask", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.AbstractOrderedLayoutState.ChildComponentData) bean).alignmentBitmask;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState.class, "minPosition", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.AbstractSplitPanelState.SplitterState) bean).minPosition;
              }
            });
            store.setGetter(com.vaadin.shared.ui.AbstractMediaState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.AbstractMediaState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.embedded.EmbeddedState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.embedded.EmbeddedState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.optiongroup.OptionGroupState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.optiongroup.OptionGroupState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.table.TableState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.table.TableState) bean).required;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).tabIndex;
              }
            });
            store.setGetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "modified", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).modified;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.popupview.PopupViewState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.popupview.PopupViewState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.window.WindowState.class, "resizable", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.window.WindowState) bean).resizable;
              }
            });
            store.setGetter(com.vaadin.shared.ui.link.LinkState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.link.LinkState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.HorizontalLayoutState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "required", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).required;
              }
            });
            store.setGetter(com.vaadin.shared.ui.AbstractMediaState.class, "sourceTypes", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.AbstractMediaState) bean).sourceTypes;
              }
            });
            store.setGetter(com.vaadin.shared.ui.image.ImageState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.image.ImageState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "tabIndex", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).tabIndex;
              }
            });
            store.setGetter(com.vaadin.shared.ui.image.ImageState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.image.ImageState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.progressindicator.ProgressIndicatorState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.progressindicator.ProgressIndicatorState) bean).readOnly;
              }
            });
            store.setGetter(com.cs.jqchart.gwt.client.shared.JQChartState.class, "uuid", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.cs.jqchart.gwt.client.shared.JQChartState) bean).uuid;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "column2", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData) bean).column2;
              }
            });
            store.setGetter(com.vaadin.shared.ui.checkbox.CheckBoxState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.checkbox.CheckBoxState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.video.VideoState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.video.VideoState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData.class, "column1", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.gridlayout.GridLayoutState.ChildComponentData) bean).column1;
              }
            });
            store.setGetter(com.vaadin.shared.AbstractFieldState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.AbstractFieldState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.VerticalSplitPanelState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.flash.FlashState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.flash.FlashState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.absolutelayout.AbsoluteLayoutState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.treetable.TreeTableState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.treetable.TreeTableState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.twincolselect.TwinColSelectState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.twincolselect.TwinColSelectState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.button.NativeButtonState.class, "disableOnClick", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.button.NativeButtonState) bean).disableOnClick;
              }
            });
            store.setGetter(com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.splitpanel.HorizontalSplitPanelState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.browserframe.BrowserFrameState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.browserframe.BrowserFrameState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.JavaScriptComponentState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.JavaScriptComponentState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.tree.TreeState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.tree.TreeState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.orderedlayout.VerticalLayoutState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.orderedlayout.VerticalLayoutState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.video.VideoState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.video.VideoState) bean).caption;
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.slider.SliderOrientation.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.slider.SliderOrientation>() {
                  public com.google.gwt.json.client.JSONValue serialize(com.vaadin.shared.ui.slider.SliderOrientation value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.slider.SliderOrientation castedValue = (com.vaadin.shared.ui.slider.SliderOrientation) value;
                    return new com.google.gwt.json.client.JSONString(castedValue.name());
                  }
                  public com.vaadin.shared.ui.slider.SliderOrientation deserialize(Type type, com.google.gwt.json.client.JSONValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = ((com.google.gwt.json.client.JSONString)jsonValue).stringValue();
                    if ("HORIZONTAL".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.slider.SliderOrientation.HORIZONTAL;
                    }
                    if ("VERTICAL".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.slider.SliderOrientation.VERTICAL;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.ui.label.ContentMode.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.ui.label.ContentMode>() {
                  public com.google.gwt.json.client.JSONValue serialize(com.vaadin.shared.ui.label.ContentMode value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.ui.label.ContentMode castedValue = (com.vaadin.shared.ui.label.ContentMode) value;
                    return new com.google.gwt.json.client.JSONString(castedValue.name());
                  }
                  public com.vaadin.shared.ui.label.ContentMode deserialize(Type type, com.google.gwt.json.client.JSONValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = ((com.google.gwt.json.client.JSONString)jsonValue).stringValue();
                    if ("TEXT".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.label.ContentMode.TEXT;
                    }
                    if ("PREFORMATTED".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.label.ContentMode.PREFORMATTED;
                    }
                    if ("HTML".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.label.ContentMode.HTML;
                    }
                    if ("XML".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.label.ContentMode.XML;
                    }
                    if ("RAW".equals(enumIdentifier)) {
                      return com.vaadin.shared.ui.label.ContentMode.RAW;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.MouseEventDetails.MouseButton.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<com.vaadin.shared.MouseEventDetails.MouseButton>() {
                  public com.google.gwt.json.client.JSONValue serialize(com.vaadin.shared.MouseEventDetails.MouseButton value, com.vaadin.client.ApplicationConnection connection) {
                    com.vaadin.shared.MouseEventDetails.MouseButton castedValue = (com.vaadin.shared.MouseEventDetails.MouseButton) value;
                    return new com.google.gwt.json.client.JSONString(castedValue.name());
                  }
                  public com.vaadin.shared.MouseEventDetails.MouseButton deserialize(Type type, com.google.gwt.json.client.JSONValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    String enumIdentifier = ((com.google.gwt.json.client.JSONString)jsonValue).stringValue();
                    if ("LEFT".equals(enumIdentifier)) {
                      return com.vaadin.shared.MouseEventDetails.MouseButton.LEFT;
                    }
                    if ("RIGHT".equals(enumIdentifier)) {
                      return com.vaadin.shared.MouseEventDetails.MouseButton.RIGHT;
                    }
                    if ("MIDDLE".equals(enumIdentifier)) {
                      return com.vaadin.shared.MouseEventDetails.MouseButton.MIDDLE;
                    }
                    return null;
                  }
                };
              }
            });
            store.setSerializerFactory(com.vaadin.shared.communication.URLReference.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.communication.URLReference_Serializer.class);
              }
            });
            load20();
          }
          private void load20() {
            store.setDelegateToWidget(com.vaadin.shared.ui.textarea.TextAreaState.class, "wordwrap", "");
            store.setDelegateToWidget(com.vaadin.shared.ui.textarea.TextAreaState.class, "rows", "");
            store.setHasGetTooltipInfo(com.vaadin.client.ui.menubar.MenuBarConnector.class);
            store.setHasGetTooltipInfo(com.vaadin.client.ui.tabsheet.TabsheetConnector.class);
            store.setHasGetTooltipInfo(com.vaadin.client.ui.form.FormConnector.class);
            store.setHasGetTooltipInfo(com.vaadin.client.ui.ui.UIConnector.class);
            store.setHasGetTooltipInfo(com.vaadin.client.ui.tree.TreeConnector.class);
            store.setHasGetTooltipInfo(com.vaadin.client.ui.table.TableConnector.class);
            store.setHasGetTooltipInfo(com.vaadin.client.ui.formlayout.FormLayoutConnector.class);
            store.setHasGetTooltipInfo(com.vaadin.client.ui.treetable.TreeTableConnector.class);
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        }.onSuccess();
      }
    });
    addAsyncBlockLoader(new AsyncBundleLoader("__deferred", new String[] {}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        });
      }
    });
    addAsyncBlockLoader(new AsyncBundleLoader("RichTextAreaConnector", new String[] {"com.vaadin.ui.RichTextArea",}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            store.setClass("com.vaadin.ui.RichTextArea", com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class);
            store.setConstructor(com.vaadin.client.ui.VRichTextArea.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.VRichTextArea.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class);
              }
            });
            store.setReturnType(com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class, "getState", new Type(com.vaadin.shared.AbstractFieldState.class));
            store.setReturnType(com.vaadin.client.ui.richtextarea.RichTextAreaConnector.class, "getWidget", new Type(com.vaadin.client.ui.VRichTextArea.class));
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        });
      }
    });
    addAsyncBlockLoader(new AsyncBundleLoader("ColorPickerGradientConnector", new String[] {"com.vaadin.ui.components.colorpicker.ColorPickerGradient",}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            store.setClass("com.vaadin.ui.components.colorpicker.ColorPickerGradient", com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector.class);
            store.setConstructor(com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class);
              }
            });
            store.setReturnType(com.vaadin.client.ui.colorpicker.ColorPickerGradientConnector.class, "getState", new Type(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class));
            store.setProperties(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, new String[] {"registeredEventListeners", "immediate", "width", "primaryStyleName", "cursorX", "caption", "enabled", "cursorY", "bgColor", "resources", "styles", "description", "id", "errorMessage", "readOnly", "height", });
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "cursorX", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "cursorY", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "bgColor", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "height", new Type(java.lang.String.class));
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "cursorX", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).cursorX = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "cursorY", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).cursorY = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "bgColor", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).bgColor = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "cursorX", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).cursorX;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "cursorY", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).cursorY;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "bgColor", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).bgColor;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGradientState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGradientState) bean).height;
              }
            });
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        });
      }
    });
    addAsyncBlockLoader(new AsyncBundleLoader("ColorPickerAreaConnector", new String[] {"com.vaadin.ui.ColorPickerArea",}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            store.setClass("com.vaadin.ui.ColorPickerArea", com.vaadin.client.ui.colorpicker.ColorPickerAreaConnector.class);
            store.setConstructor(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.colorpicker.ColorPickerState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.colorpicker.ColorPickerAreaConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.colorpicker.ColorPickerAreaConnector.class);
              }
            });
            store.setReturnType(com.vaadin.client.ui.colorpicker.ColorPickerAreaConnector.class, "getWidget", new Type(com.vaadin.client.ui.VColorPickerArea.class));
            store.setReturnType(com.vaadin.client.ui.colorpicker.ColorPickerAreaConnector.class, "getState", new Type(com.vaadin.shared.ui.colorpicker.ColorPickerState.class));
            store.setInvoker(com.vaadin.client.ui.VColorPickerArea.class, "setColor", new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VColorPickerArea) target).setColor((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VColorPickerArea.class, "setOpen", new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VColorPickerArea) target).setOpen((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setProperties(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, new String[] {"errorMessage", "htmlContentAllowed", "popupVisible", "readOnly", "registeredEventListeners", "height", "styles", "immediate", "caption", "id", "color", "width", "description", "enabled", "resources", "showDefaultCaption", "primaryStyleName", });
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "htmlContentAllowed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "popupVisible", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "color", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "showDefaultCaption", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "htmlContentAllowed", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).htmlContentAllowed = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "popupVisible", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).popupVisible = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "color", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).color = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "showDefaultCaption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).showDefaultCaption = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "htmlContentAllowed", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).htmlContentAllowed;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "popupVisible", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).popupVisible;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "color", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).color;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "showDefaultCaption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).showDefaultCaption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).primaryStyleName;
              }
            });
            store.setDelegateToWidget(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "popupVisible", "setOpen");
            store.setDelegateToWidget(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "color", "setColor");
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        });
      }
    });
    addAsyncBlockLoader(new AsyncBundleLoader("ColorPickerConnector", new String[] {"com.vaadin.ui.ColorPicker",}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            store.setClass("com.vaadin.ui.ColorPicker", com.vaadin.client.ui.colorpicker.ColorPickerConnector.class);
            store.setConstructor(com.vaadin.client.ui.colorpicker.ColorPickerConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.colorpicker.ColorPickerConnector.class);
              }
            });
            store.setConstructor(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.colorpicker.ColorPickerState.class);
              }
            });
            store.setReturnType(com.vaadin.client.ui.colorpicker.ColorPickerConnector.class, "getWidget", new Type(com.vaadin.client.ui.VColorPicker.class));
            store.setReturnType(com.vaadin.client.ui.colorpicker.ColorPickerConnector.class, "getState", new Type(com.vaadin.shared.ui.colorpicker.ColorPickerState.class));
            store.setInvoker(com.vaadin.client.ui.VColorPicker.class, "setColor", new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VColorPicker) target).setColor((java.lang.String) params[0]);
                return null;
              }
            });
            store.setInvoker(com.vaadin.client.ui.VColorPicker.class, "setOpen", new Invoker() {
              public Object invoke(Object target, Object[] params) {
                ((com.vaadin.client.ui.VColorPicker) target).setOpen((java.lang.Boolean) params[0]);
                return null;
              }
            });
            store.setProperties(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, new String[] {"errorMessage", "htmlContentAllowed", "popupVisible", "readOnly", "registeredEventListeners", "height", "styles", "immediate", "caption", "id", "color", "width", "description", "enabled", "resources", "showDefaultCaption", "primaryStyleName", });
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "htmlContentAllowed", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "popupVisible", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "color", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "showDefaultCaption", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "htmlContentAllowed", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).htmlContentAllowed = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "popupVisible", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).popupVisible = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "color", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).color = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "showDefaultCaption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).showDefaultCaption = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "htmlContentAllowed", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).htmlContentAllowed;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "popupVisible", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).popupVisible;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "color", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).color;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "showDefaultCaption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).showDefaultCaption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerState) bean).primaryStyleName;
              }
            });
            store.setDelegateToWidget(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "popupVisible", "setOpen");
            store.setDelegateToWidget(com.vaadin.shared.ui.colorpicker.ColorPickerState.class, "color", "setColor");
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        });
      }
    });
    addAsyncBlockLoader(new AsyncBundleLoader("ColorPickerGridConnector", new String[] {"com.vaadin.ui.components.colorpicker.ColorPickerGrid",}) {
      protected void load(final com.vaadin.client.metadata.TypeDataStore store) {
        com.google.gwt.core.client.GWT.runAsync(new com.google.gwt.core.client.RunAsyncCallback() {
          public void onSuccess() {
            load();
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoaded(getName());
          }
          private void load() {
            store.setClass("com.vaadin.ui.components.colorpicker.ColorPickerGrid", com.vaadin.client.ui.colorpicker.ColorPickerGridConnector.class);
            store.setConstructor(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class);
              }
            });
            store.setConstructor(com.vaadin.client.ui.colorpicker.ColorPickerGridConnector.class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return com.google.gwt.core.client.GWT.create(com.vaadin.client.ui.colorpicker.ColorPickerGridConnector.class);
              }
            });
            store.setReturnType(com.vaadin.client.ui.colorpicker.ColorPickerGridConnector.class, "getState", new Type(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class));
            store.setProperties(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, new String[] {"immediate", "rowCount", "changedColor", "resources", "height", "registeredEventListeners", "readOnly", "description", "caption", "id", "enabled", "primaryStyleName", "changedX", "width", "errorMessage", "columnCount", "styles", "changedY", });
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "immediate", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "rowCount", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "changedColor", new Type(java.lang.String[].class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "resources", new Type("java.util.Map", new Type[] {new Type(java.lang.String.class), new Type(com.vaadin.shared.communication.URLReference.class), }));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "height", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "registeredEventListeners", new Type("java.util.Set", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "readOnly", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "description", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "caption", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "id", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "enabled", new Type(java.lang.Boolean.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "primaryStyleName", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "width", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "changedX", new Type(java.lang.String[].class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "columnCount", new Type(java.lang.Integer.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "errorMessage", new Type(java.lang.String.class));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "styles", new Type("java.util.List", new Type[] {new Type(java.lang.String.class), }));
            store.setPropertyType(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "changedY", new Type(java.lang.String[].class));
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).immediate = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "rowCount", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).rowCount = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "changedColor", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).changedColor = (java.lang.String[])params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).resources = (java.util.Map)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).height = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).registeredEventListeners = (java.util.Set)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).readOnly = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).description = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).caption = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).id = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).enabled = (java.lang.Boolean)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).primaryStyleName = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).width = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "changedX", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).changedX = (java.lang.String[])params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "columnCount", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).columnCount = (java.lang.Integer)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).errorMessage = (java.lang.String)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).styles = (java.util.List)params[0];return null;
              }
            });
            store.setSetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "changedY", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).changedY = (java.lang.String[])params[0];return null;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "immediate", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).immediate;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "rowCount", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).rowCount;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "changedColor", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).changedColor;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "resources", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).resources;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "height", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).height;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "registeredEventListeners", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).registeredEventListeners;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "readOnly", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).readOnly;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "description", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).description;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "caption", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).caption;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "id", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).id;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "enabled", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).enabled;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "primaryStyleName", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).primaryStyleName;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "width", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).width;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "changedX", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).changedX;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "columnCount", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).columnCount;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "errorMessage", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).errorMessage;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "styles", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).styles;
              }
            });
            store.setGetter(com.vaadin.shared.ui.colorpicker.ColorPickerGridState.class, "changedY", new Invoker() {
              public Object invoke(Object bean, Object[] params) {
                return ((com.vaadin.shared.ui.colorpicker.ColorPickerGridState) bean).changedY;
              }
            });
            store.setSerializerFactory(java.lang.String[].class, new Invoker() {
              public Object invoke(Object target, Object[] params) {
                return new com.vaadin.client.communication.JSONSerializer<java.lang.String[]>() {
                  public com.google.gwt.json.client.JSONValue serialize(java.lang.String[] value, com.vaadin.client.ApplicationConnection connection) {
                    java.lang.String[] castedValue = (java.lang.String[]) value;
                    com.google.gwt.json.client.JSONArray values = new com.google.gwt.json.client.JSONArray();
                    for (int i = 0; i < castedValue.length; i++) {
                      values.set(i, com.vaadin.client.communication.JsonEncoder.encode(castedValue[i],new Type(java.lang.String.class), connection));
                    }
                    return values;
                  }
                  public java.lang.String[] deserialize(Type type, com.google.gwt.json.client.JSONValue jsonValue, com.vaadin.client.ApplicationConnection connection) {
                    com.google.gwt.json.client.JSONArray jsonArray = jsonValue.isArray();
                    java.lang.String[] value = new java.lang.String[jsonArray.size()];
                    for(int i = 0 ; i < value.length; i++) {
                      value[i] = (java.lang.String) com.vaadin.client.communication.JsonDecoder.decodeValue(new Type(java.lang.String.class), jsonArray.get(i), null, connection);
                    }
                    return value;
                  }
                };
              }
            });
          }
          public void onFailure(Throwable reason) {
            com.vaadin.client.metadata.ConnectorBundleLoader.get().setLoadFailure(getName(), reason);
          }
        });
      }
    });
  }
}
