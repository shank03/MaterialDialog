package com.alpha.dev.materialdialog;

/**********************************************************************************************************************
 * Alpha Developer<sup>TM</sup> Inc. Copyright (c) 2019.                                                              *
 * This is the work of, from and by individual team member.  Any duplication or publication of this code without our  *
 * consent AND without this Copyrighted Text is subjected to Copyright Infringement and could even lead to court      *
 * cases.                                                                                                             *
 *                                                                                                                    *
 * Contact emails :-                                                                                                  *
 *     (Group) alphadeveloper3@gmail.com                                                                              *
 *     (Team Leader) shashank.verma2002@gmail.com                                                                     *
 **********************************************************************************************************************/

public interface MaterialDialogInterface {

    interface OnPositiveClickListener {
        void onClick(MaterialAlertDialog dialog);
    }

    interface OnNegativeClickListener {
        void onClick(MaterialAlertDialog dialog);
    }

    interface OnNeutralClickListener {
        void onClick(MaterialAlertDialog dialog);
    }
}
