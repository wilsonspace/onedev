package com.pmease.gitplex.core.event.pullrequest;

import java.util.Date;

import com.pmease.commons.wicket.editable.annotation.Editable;
import com.pmease.gitplex.core.entity.Account;
import com.pmease.gitplex.core.entity.PullRequest;
import com.pmease.gitplex.core.event.MarkdownAware;

@Editable(name="opened")
public class PullRequestOpened extends PullRequestChangeEvent implements MarkdownAware {

	public PullRequestOpened(PullRequest request) {
		super(request);
	}

	@Override
	public String getMarkdown() {
		return getRequest().getDescription();
	}

	@Override
	public Account getUser() {
		return getRequest().getSubmitter();
	}

	@Override
	public Date getDate() {
		return getRequest().getSubmitDate();
	}

}